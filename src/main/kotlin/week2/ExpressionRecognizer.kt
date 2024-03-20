package week2

import Expressions
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.Token

//const val text = "123 myId 0.4 if 5.5 6 .2 + - * /()"
//const val text = "((2+3) + 1)"
const val text = "2 + 3"
val lexer = Expressions(CharStreams.fromString(text))
val tokens = lexer.allTokens

fun parenthesesValidator(): Boolean {
    var count = 0;
    for (token in tokens) {
        if (token.type == Expressions.OPENING_PARENTHESIS) {
            count++
        } else if (token.type == Expressions.CLOSING_PARENTHESIS) {
            count--
        }
        if (count < 0) {
            return false
        }
    }
    return count == 0;
}

fun binaryOperatorValidator(): Boolean {
    println(tokens)
    
    if (tokens.isEmpty()) {
        return true
    }
    
    if (tokens[0].type == Expressions.OPERATOR || tokens[tokens.size - 1].type == Expressions.OPERATOR) {
        return false
    }
    
    if (tokens.size >= 3) {
        for (i in 1 until tokens.size - 1) {
            if (tokens[i].type == Expressions.OPERATOR) {
                if ((tokens[i - 1].type != Expressions.INT || tokens[i - 1].type != Expressions.FLOAT) &&
                    (tokens[i + 1].type != Expressions.INT || tokens[i + 1].type != Expressions.FLOAT)) {
                    println("failed")
                    return false
                }
            }
        }
    }
    return true
    /*for (token in tokens) {
        if (token.type == Expressions.OPERATOR) {
            
        }
        
        if (token.type == Expressions.INT || token.type == Expressions.FLOAT) {
            if (leftVal == null) {
                leftVal = token
            }
            if (op != null) {
                rightVal = token
            }
        }
    }*/
}

fun main() {
    println(binaryOperatorValidator())
}
