package week3.csv

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import week3.csv.CsvParser.BoolContext
import week3.csv.CsvParser.CsvContext
import week3.csv.CsvParser.LineContext

fun CsvContext.toAst(): CSV =
    CSV(line().map { it.toAst() })

fun LineContext.toAst(): CsvLine =
    CsvLine(value().map {
        when {
            it.STR() != null -> CsvString(it.text.substring(1, it.text.length - 1))
            it.number() != null -> CsvNumber(it.text.toDouble())
            it.bool() != null -> CsvBool(it.text.toBoolean())
            else -> CsvNone
        }
    })

class CsvClass {
    
    fun run() {
        val text = """
            "Alan Kay",1940,,true
            "Donald Knuth",  1938, ,true
            "Alan Turing";1954; ;false
        """.trimIndent()
        val lexer = CsvLexer(CharStreams.fromString(text))
        val parser = CsvParser(CommonTokenStream(lexer))
        val test = parser.csv()
        
        println(test.toAst().toText())
        println()
        
        println("Is valid: " + validate(test))
        for(line in test.line()) {
            println(line.text)
            println("size: " + line.value().size)
            line.value().forEach {
                println(it.text)
                if (it.bool() != null) {
                    println("bool")
                }
                if (it.number() != null) {
                    println("number")
                }
                if (it.STR() != null) {
                    println("string")
                }
            }
        }
    }
    
    fun validate(csv: CsvContext): Boolean {
        if (csv.line().isEmpty()) {
            return true
        }
        val dataTypes = csv.line(0).value().map {value ->
            when {
                value.STR() != null -> String::class
                value.bool() != null -> Boolean::class
                value.number() != null -> Number::class
                else -> Any::class
            }
        }
        for (line in csv.line().drop(1)) {
            val lineTypes = line.value().map { value ->
                when {
                    value.STR() != null -> String::class
                    value.bool() != null -> Boolean::class
                    value.number() != null -> Number::class
                    else -> Any::class
                }
            }
            if (lineTypes != dataTypes) {
                return false
            }
        }
        return true
    }
}

fun main() {
    CsvClass().run()
}