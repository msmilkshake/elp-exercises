package week8

import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Label
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Opcodes.*
import week5.*
import java.io.FileOutputStream
import javax.swing.text.html.HTML.Tag.I


class Sintra2Bytecode(val script: Script) {
    var varIndex = 0;

    val varsMap = hashMapOf<String, Int>()

    val Operator.jvmOp: Int
        get() = when (this) {
            Operator.PLUS -> IADD
            Operator.MINUS -> ISUB
            Operator.TIMES -> IMUL
            Operator.DIVIDE -> IDIV
            Operator.MOD -> IREM
            else -> TODO()
        }

    fun generateMainMethod(cw: ClassWriter) {
        val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null)
        // inicio de escrita de corpo
        mv.visitCode()


        script.instructions.forEach {
            when (it) {
                is Print -> it.toBytecode(mv)
                is Assign -> it.toBytecode(mv)
                is IfElse -> TODO()
                is While -> TODO()
            }
        }
        // retorno (sem resultado)
        mv.visitInsn(RETURN)


        // os parametros são ignorados (dado COMPUTE_FRAMES),
        // mas esta chamada eh necessaria antes de terminar a escrita do metodo
        mv.visitMaxs(0, 0)


        // termino de escrita de metodo
        mv.visitEnd()
    }

    fun generate(clasName: String) {
        val cw = ClassWriter(ClassWriter.COMPUTE_FRAMES)


        // inicio de escrita da classe
        cw.visit(V1_8, ACC_PUBLIC, clasName, null, "java/lang/Object", null)

        generateMainMethod(cw)

        // termino de escrita da classe
        cw.visitEnd()

        // conversao para bytes e escrita em ficheiro
        val code = cw.toByteArray()
        val outputStream = FileOutputStream("$clasName.class")
        outputStream.write(code)
        outputStream.close()
    }

    fun Assign.toBytecode(mv: MethodVisitor) {
        var index = varsMap.getOrDefault(this.varId, -1)
        if (index == -1) {
            index = varIndex++
        }
        varsMap.putIfAbsent(this.varId, index)
        evaluate(mv, this.expression)
        mv.visitVarInsn(ISTORE, index)
    }

    fun Print.toBytecode(mv: MethodVisitor) {
        mv.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")
        evaluate(mv, expression) // a tratar no exercicio seguinte
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false)
    }

    fun evaluate(mv: MethodVisitor, expression: Expression) {
        when (expression) {
            is Literal -> mv.visitIntInsn(SIPUSH, expression.value)
            is Variable -> mv.visitVarInsn(ILOAD, varsMap[expression.varId]!!)
            is BinaryExpression -> {
                evaluate(mv, expression.left)
                evaluate(mv, expression.right)
                if (expression.operator.isArithmetic()) {
                    mv.visitInsn(expression.operator.jvmOp)
                } else {
                    evalBoolExpr(mv, expression.operator)
                }
            }
        }
    }

    fun evalBoolExpr(mv: MethodVisitor, operator: Operator) {
        val isTrue = Label()
        val end = Label()
        mv.visitInsn(ISUB)
        
        when (operator) {
            Operator.LTE -> TODO()
            Operator.LT -> TODO()
            Operator.EQ -> {
                mv.visitJumpInsn(IFEQ, isTrue)
                mv.visitInsn(ICONST_0)
                mv.visitJumpInsn(GOTO, end)
                
                mv.visitLabel(isTrue)
                mv.visitInsn(ICONST_1)
                
                mv.visitLabel(end)
            }

            Operator.GT -> TODO()
            Operator.GTE -> TODO()
            Operator.AND -> TODO()
            Operator.OR -> TODO()
            else -> TODO()
        }
    }

}

fun main() {
    val script = Script(
        listOf(
            Assign("a", Literal(5377)),
            Print(Variable("a")),
            Assign("b", Literal(234)),
            Assign("c", Literal(3)),
            Print(Variable("c")),
            Assign("c", Literal(4)),
            Print(Variable("c")),
            Print(Variable("b")),
            Print(Variable("a")),
            Assign("b", Literal(777)),
            Print(Variable("a")),
            Print(Variable("b")),
            Print(Variable("c")),
            Print(BinaryExpression(Literal(3), Operator.PLUS, Literal(4))),
            Print(BinaryExpression(Variable("b"), Operator.MINUS, Literal(777))),
            Assign("c", Literal(4)),
            Print(BinaryExpression(Literal(24), Operator.DIVIDE, Variable("c"))),
            Print(BinaryExpression(Variable("c"), Operator.TIMES, Variable("c"))),
            Print(BinaryExpression(Literal(5), Operator.EQ, Literal(4))),
            Print(BinaryExpression(Literal(3), Operator.EQ, Literal(3))),
        ), listOf()
    )
    val gen = Sintra2Bytecode(script)
    gen.generate("Teste")
}