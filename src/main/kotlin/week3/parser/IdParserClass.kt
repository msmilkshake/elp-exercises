package week3.parser

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class IdParserClass {

    fun main() {
        val lexer = IdParserLexer(CharStreams.fromString("x,y,x,max"))
        val parser = IdParserParser(CommonTokenStream(lexer))
        val test = parser.test()
        for(id in test.id())
            println(id.text) // x  y  x  max
    }
}


fun main() {
    IdParserClass().main()
}