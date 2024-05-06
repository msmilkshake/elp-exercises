package week7

// evita estar a escrever sempre “Opcodes.”
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.*
import java.io.FileOutputStream

fun main() {
    val cw = ClassWriter(ClassWriter.COMPUTE_FRAMES)


    // inicio de escrita da classe
    cw.visit(V1_8, ACC_PUBLIC, "HelloWorld", null, "java/lang/Object", null)


    generateMainWithCall(cw)
    addIncMethod(cw)


    // termino de escrita da classe
    cw.visitEnd()


    // conversao para bytes e escrita em ficheiro
    val code = cw.toByteArray()
    val outputStream = FileOutputStream("HelloWorld.class")
    outputStream.write(code)
    outputStream.close()
}

fun generateMain(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null)


    // inicio de escrita de corpo
    mv.visitCode()


    // push objeto PrintStream
    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")


    // push objeto String
    mv.visitLdcInsn("Hello, World!")


    // invocacao (2 x pop)
    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V", false)


    // retorno (sem resultado)
    mv.visitInsn(RETURN)


    // os parametros são ignorados (dado COMPUTE_FRAMES),
    // mas esta chamada eh necessaria antes de terminar a escrita do metodo
    mv.visitMaxs(0, 0)


    // termino de escrita de metodo
    mv.visitEnd()
}

fun addIncMethod(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "inc", "(I)I", null, null)
    mv.visitCode()


    mv.visitVarInsn(ILOAD, 0)
    mv.visitInsn(ICONST_1)
    mv.visitInsn(IADD)
    mv.visitInsn(IRETURN)


    mv.visitMaxs(0, 0)
    mv.visitEnd()
}

fun generateMainWithCall(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null)
    mv.visitCode()


    // argumento
    mv.visitIntInsn(SIPUSH,5)


    // invocacao
    mv.visitMethodInsn(INVOKESTATIC, "HelloWorld", "inc", "(I)I", false)


    // argumento
    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")


    // troca ordem dos dois valores no topo da pilha
    mv.visitInsn(SWAP)


    // invocacao
    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false)


    // retorno (sem resultado)
    mv.visitInsn(RETURN)
    mv.visitMaxs(0, 0)
    mv.visitEnd()
}
