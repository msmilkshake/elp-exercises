package week2

import Expressions
import org.antlr.v4.runtime.CharStreams

fun main() {
    val text = "123 myId 0.4 if 5.5 6 .2 + - * /()"
    val lexer = Expressions(CharStreams.fromString(text))
    val tokens = lexer.allTokens
    tokens.forEach {
//        if (it.type == Expressions.INT) {
//            println(it.text + " inteiro")
//        } else if (it.type == Expressions.FLOAT) {
//            println(it.text + " float")
//        }
        println("${it.text} ${lexer.vocabulary.getSymbolicName(it.type)}")
    }
}
