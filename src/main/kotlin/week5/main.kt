package week5

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.io.File
import java.io.PrintStream

fun main() {
    val script = Script(
        listOf(
            // b = a * 100
            Assign("b", BinaryExpression(Variable("a"), Operator.TIMES, Literal(100))),
            // c = b + 1     
            Assign("c", BinaryExpression(Variable("b"), Operator.PLUS, Literal(1))),
            // 101
            Print(Variable("c"))
        ),
        listOf("a") // parameter
    )
    println(script)
    println(script.validate())
    
    println("-----------------------")
    
    val firstInterpreter = Interpreter(script)
    firstInterpreter.run("a" to 1) // argument
    
    println("-----------------------")
    
    val strScript = """
        b = (8 + 10) / 4
        print(b)

        # Another one bites the dust

        c = a + 4 * a #I am a comment
        print(c)

        print(b + (500 / (2 * a) - 1))

        # Final comment

    """.trimIndent()
    
    val lexer = SintraLexer(CharStreams.fromString(strScript))
    val parser = SintraParser(CommonTokenStream(lexer))
    val interpreter = Interpreter(parser.script().toAst())
    println("Script:\n${strScript}\nEOF")
    val defaultOutputChannel = System.out
    System.setOut(PrintStream(File("output.txt")))
    
    interpreter.run("a" to 1)
    
    System.setOut(defaultOutputChannel)
    println("Check output.txt to see the script output.")
}