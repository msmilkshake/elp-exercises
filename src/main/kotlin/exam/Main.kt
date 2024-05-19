package exam

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main(args: Array<String>) {
    
    val interpreter = Interpreter(args[0])
    interpreter.run(*args)
}