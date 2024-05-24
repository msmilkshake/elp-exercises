package exam

fun main(args: Array<String>) {
    val interpreter = Interpreter(args[0])
    interpreter.run(*args)
}