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
    firstInterpreter.run("a" to 1)
    
    println("-----------------------")
    
    val strScript = """
        b = (8 + 10) / 4
        #d = c + 1
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

    println("-----------------------")
    
    val script2Str = """
        while(0) {
            a = 3 + 4
            print(b + 5)
            
        }

        b = (8 + 10) / a
        print(b)

        # Another one bites the dust

        c = a + 4 * a #I am a comment
        print(c)

        print(b + (500 / (2 * a) - 1))

        s = 0
        i = 0

        while(i < 10) {
            if(i % 2 == 0) {
                s = s + i
            }
            i = i + 1
            print(i)
        }
        print(s)


        # Final comment

    """.trimIndent()
    
    val lexer2 = SintraLexer(CharStreams.fromString(script2Str))
    val parser2 = SintraParser(CommonTokenStream(lexer2))
    val interpreter2 = Interpreter(parser2.script().toAst())
    println("Script:\n${script2Str}\nEOF")
    System.setOut(PrintStream(File("output2.txt")))

    interpreter2.run("a" to 1)

    System.setOut(defaultOutputChannel)
    println("Check output2.txt to see the script output.")
}