package week2

import Expressions
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonToken
import org.antlr.v4.runtime.Token

fun <T> MutableList<T>.push(e: T) {
    add(e);
}

fun <T> MutableList<T>.pop(): T {
    return removeLast()
}

const val expression = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )"
val lexer2 = Expressions(CharStreams.fromString(expression))
val tokens2: List<Token> = lexer2.allTokens

fun solveExpression() {
    val vals = mutableListOf<Token>()
    val ops = mutableListOf<Token>()
    for (token in tokens2) {
        when (token.type) {
            Expressions.INT, Expressions.FLOAT -> vals.push(token)
            Expressions.OPERATOR -> ops.push(token)
            Expressions.CLOSING_PARENTHESIS -> {
                val b = vals.pop().text.toFloat()
                val a = vals.pop().text.toFloat()
                val op = ops.pop().text
                vals.push(
                    when (op) {
                        "+" -> CommonToken(Expressions.FLOAT, "${a + b}")
                        "-" -> CommonToken(Expressions.FLOAT, "${a - b}")
                        "*" -> CommonToken(Expressions.FLOAT, "${a * b}")
                        "/" -> CommonToken(Expressions.FLOAT, "${a / b}")
                        else -> throw UnsupportedOperationException()
                    }
                )
            }

            else -> continue
        }
    }
    println("Result: ${vals.pop().text}")
}

fun main() {
    solveExpression()
}