package week4

import com.github.javaparser.StaticJavaParser
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration
import com.github.javaparser.ast.expr.AssignExpr
import com.github.javaparser.ast.expr.ConditionalExpr
import com.github.javaparser.ast.expr.Expression
import com.github.javaparser.ast.expr.NameExpr
import com.github.javaparser.ast.stmt.BlockStmt
import com.github.javaparser.ast.stmt.ExpressionStmt
import com.github.javaparser.ast.stmt.IfStmt
import com.github.javaparser.ast.stmt.ReturnStmt
import com.github.javaparser.ast.stmt.Statement
import com.github.javaparser.ast.stmt.WhileStmt
import com.github.javaparser.ast.type.Type
import java.util.*

fun main() {
    val src = """
        public class Test {
            static boolean isNegative(int n) {
                return n < 0;
            }
            
            static int abs(int n) {
                return n < 0 ? -n : n;
            }
            
            static int fact(int n) {
                if(n == 1)
                    return 1;
                else
                    return n * fact(n-1);
            }
            
            static String toString() {
                return "I am a toString()";
            }
        }
    """.trimIndent()

    val clazz = StaticJavaParser.parse(src).types[0] as ClassOrInterfaceDeclaration

    clazz.methods.forEach {
        println(it)
    }


    println(clazz.nameAsString)
    clazz.methods.forEach {
        println("\t ${it.name}")
    }

    println("\n----- Tipos -----")
    clazz.methods.forEach {
        println("Original: ${it.type}, Translated: ${translate(it.type)}")
    }

    println("\n----- Expressões -----")
    val exp1: Expression = StaticJavaParser.parseExpression("a = true ? 0 : 1")
    println(translate(exp1))
    val exp2: Expression = StaticJavaParser.parseExpression("a + b + c")
    println(translate(exp2))
    val exp3: Expression = StaticJavaParser.parseExpression("""
        myVar = "String Literal " + otherVar.toString()
    """.trimIndent())
    println(translate(exp3))
    
    println("\n----- Instruções -----")
    val stmt1: Statement = StaticJavaParser.parseStatement("return a + b;")
    println(translate(stmt1))
    val stmt2: Statement = StaticJavaParser.parseStatement("""
        if(n == 1)
            return 1;
        else
            return n * fact(n-1);
    """.trimIndent())
    println(translate(stmt2))
}

fun translate(t: Type): String {
    if (t.isPrimitiveType) {
        return t.asString()
            .replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    }
    return t.asString()
}

fun translate(e: Expression): String {
    return when (e) {
        is NameExpr -> {
            e.nameAsString
        }
        is ConditionalExpr -> {
            "if (" + translate(e.condition) + ") " + translate(e.thenExpr) + " else " + translate(e.elseExpr)
        }
        is AssignExpr -> {
            e.target.toString() + " = " + translate(e.value)
        }
        else -> e.toString()
    }
}

fun translate(e: Statement): String {
    return when(e) {
        is ExpressionStmt -> {
            translate(e.expression)
        }
        is ReturnStmt -> {
            if (e.expression.isPresent) {
                "return " + translate(e.expression.get())
            } else{
                "return"
            }
        }
        is IfStmt -> {
            ""
        }
        is WhileStmt -> {
            ""
        }
        is BlockStmt -> {
            ""
        }
        else -> e.toString()
    }
}