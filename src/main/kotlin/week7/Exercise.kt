package week7

// evita estar a escrever sempre “Opcodes.”
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Label
import org.objectweb.asm.Opcodes.*
import java.io.FileOutputStream

fun addIsPositiveMethod(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "isPositive", "(I)Z", null, null)
    mv.visitCode()
    
    val end = Label()
    val trueCase = Label()

    mv.visitVarInsn(ILOAD, 0)
    mv.visitJumpInsn(IFGT, trueCase)
    mv.visitInsn(ICONST_0)
    mv.visitJumpInsn(GOTO, end)


    mv.visitLabel(trueCase)
    mv.visitInsn(ICONST_1)


    mv.visitLabel(end)
    mv.visitInsn(IRETURN)


    mv.visitMaxs(0, 0)
    mv.visitEnd()
}

fun addAbsMethod(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "abs", "(I)I", null, null)
    mv.visitCode()
    
    val end = Label()
    val trueCase = Label()
    
    mv.visitVarInsn(ILOAD, 0)
    mv.visitJumpInsn(IFGT, trueCase)
    mv.visitVarInsn(ILOAD, 0)
    mv.visitIntInsn(SIPUSH, -1)
    mv.visitInsn(IMUL)
    mv.visitJumpInsn(GOTO, end)
    
    mv.visitLabel(trueCase)
    mv.visitVarInsn(ILOAD, 0)
    
    mv.visitLabel(end)
    mv.visitInsn(IRETURN)

    mv.visitMaxs(0, 0)
    mv.visitEnd()
}

fun addIsPairMethod(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "isPair", "(I)Z", null, null)
    mv.visitCode()
    
    val trueCase = Label()
    val end = Label()
    
    mv.visitVarInsn(ILOAD, 0)
    mv.visitInsn(ICONST_2)
    mv.visitInsn(IREM)
    mv.visitJumpInsn(IFEQ, trueCase)
    mv.visitInsn(ICONST_0)
    mv.visitJumpInsn(GOTO, end)
    
    mv.visitLabel(trueCase)
    mv.visitInsn(ICONST_1)
    
    mv.visitLabel(end)
    mv.visitInsn(IRETURN)

    mv.visitMaxs(0, 0)
    mv.visitEnd()
}

fun addFirstDigitMethod(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "firstDigit", "(I)I", null, null)
    mv.visitCode()
    
    val loop = Label()
    val end = Label()
    
    mv.visitVarInsn(ILOAD, 0) //50
    mv.visitVarInsn(ISTORE, 1)//50
    
    mv.visitLabel(loop)
    
    mv.visitVarInsn(ILOAD, 0) //50
    mv.visitIntInsn(SIPUSH, 10)
    mv.visitInsn(IDIV) // 5
    mv.visitVarInsn(ISTORE, 0) //
    mv.visitVarInsn(ILOAD, 0) // 5
    mv.visitJumpInsn(IFEQ, end) // NAO
    mv.visitVarInsn(ILOAD, 0) //5
    mv.visitVarInsn(ISTORE, 1) //5
    
    mv.visitJumpInsn(GOTO, loop)
    
    mv.visitLabel(end)
    mv.visitVarInsn(ILOAD, 1) // 5
    mv.visitInsn(IRETURN)

    mv.visitMaxs(0, 0)
    mv.visitEnd()
}

fun generateMainMethod(cw: ClassWriter) {
    val mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null)
    mv.visitCode()

    mv.visitIntInsn(SIPUSH,5)
    
    mv.visitMethodInsn(INVOKESTATIC, "Exercise", "isPositive", "(I)Z", false)
    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")

    mv.visitInsn(SWAP)

    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Z)V", false)
    
    mv.visitIntInsn(SIPUSH,7)
    mv.visitMethodInsn(INVOKESTATIC, "Exercise", "abs", "(I)I", false)
    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")
    mv.visitInsn(SWAP)
    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false)

    mv.visitIntInsn(SIPUSH,-8)
    mv.visitMethodInsn(INVOKESTATIC, "Exercise", "abs", "(I)I", false)
    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")
    mv.visitInsn(SWAP)
    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false)

    mv.visitIntInsn(SIPUSH,4050)
    mv.visitMethodInsn(INVOKESTATIC, "Exercise", "firstDigit", "(I)I", false)
    mv.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")
    mv.visitInsn(SWAP)
    mv.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(I)V", false)
    
    mv.visitInsn(RETURN)
    mv.visitMaxs(0, 0)
    mv.visitEnd()
}

fun main() {
    val cw = ClassWriter(ClassWriter.COMPUTE_FRAMES)

    cw.visit(V1_8, ACC_PUBLIC, "Exercise", null, "java/lang/Object", null)
    
    generateMainMethod(cw)
    addIsPositiveMethod(cw)
    addAbsMethod(cw)
    addIsPairMethod(cw)
    addFirstDigitMethod(cw)

    cw.visitEnd()

    val code = cw.toByteArray()
    val outputStream = FileOutputStream("Exercise.class")
    outputStream.write(code)
    outputStream.close()
}