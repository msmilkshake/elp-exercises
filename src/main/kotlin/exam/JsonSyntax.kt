package exam

import exam.JsonParser.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun JValueContext.toAst(): JValue =
    when {
        this.jNull() != null -> this.jNull().toAst()
        this.jNumber() != null -> this.jNumber().toAst()
        this.jBoolean() != null -> this.jBoolean().toAst()
        this.jString() != null -> this.jString().toAst()
        this.jArray() != null -> this.jArray().toAst()
        this.jObject() != null -> this.jObject().toAst()
        else -> throw IllegalArgumentException("Cannot convert $this to Ast")
    }

fun JStringContext.toAst(): JString =
    JString(this.text)

fun JNumberContext.toAst(): JNumber =
    JNumber(this.text.toDouble())

fun JBooleanContext.toAst(): JBoolean =
    JBoolean(this.text.toBoolean())

fun JNullContext.toAst(): JNull =
    JNull

fun JObjectContext.toAst(): JObject =
    JObject(jField().map {
        JField(it.name().text, it.jValue().toAst())
    })

fun JArrayContext.toAst(): JArray =
    JArray(jValue().map {
        when {
            it.jObject() != null -> it.jObject().toAst()
            it.jArray() != null -> JArray(
                it.jArray().jValue().map { it2 ->
                    it2.toAst()
                }
            )
            it.jString() != null -> JString(it.text)
            it.jNumber() != null -> JNumber(it.text.toFloat())
            it.jBoolean() != null -> JBoolean(it.text.toBoolean())
            it.jNull() != null -> JNull
            else -> throw IllegalArgumentException("Cannot convert $this to Ast")
        }
    })


fun main() {
//    val text = """
//            { "a": [{ "a": [1,2,3], "a": [4,5,6], "a": true, "myField": 3.77 }, { "a": [1,2,3], "b": [4,5,6], "c": true, "myField": 3.77 }, { "a": [1,2,3], "b": [4,5,6], "c": true, "myField": 3.77 }], "b": [4,5,6], "c": true, "myField": 3.77 }
//        """.trimIndent()
    
//    val text = """
//            { "a": [{ "a": [1,2,3], "b": [4,5,6], "c": true, "myField": 3.77 }, { "a": [1,2,3], "b": [4,5,6], "c": true, "myField": 3.77 }, { "a": [1,2,3], "b": [4,5,6], "c": true, "myField": 3.77 }], "b": [4,5,6], "c": true, "myField": 3.77 }
//        """.trimIndent()

//    val text = """
//            { "a": [1, false] }
//        """.trimIndent()
    
    val text = """
            { "a": ["1", "false"], "aa": 3 }
        """.trimIndent()
    
    val lexer = JsonLexer(CharStreams.fromString(text))
    val parser = JsonParser(CommonTokenStream(lexer))
    val test: JValue = parser.jObject().toAst()
    println("Valid Object fields: ${test.validateFields()}")
    println("Valid Array types: ${test.validateArrayType()}")
    

    println(test)
    println()
}