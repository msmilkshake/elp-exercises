package exam

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

sealed interface JValue

data class JField(val name: String, val value: JValue) {
    fun toString(indent: String): String =
        "$name: ${(value as? JObject)?.toString(indent) ?: (value as? JArray)?.toString(indent) ?: value}"

    override fun toString(): String = toString("")
}

data class JObject(val fields: List<JField>) : JValue {
    fun validateNames() {
        val fieldNames: MutableSet<String> = mutableSetOf()
        fields.forEach {
            if (fieldNames.contains(it.name)) {
                throw Exception("Object has repeated name: ${it.name}")
            }
            fieldNames.add(it.name)
        }
    }

    fun toString(indent: String): String {
        val jsonFields = fields.joinToString(",\n") {
            "$indent  ${it.toString("$indent  ")}"
        }
        return "{\n$jsonFields\n$indent}"
    }

    override fun toString(): String = toString("")
}

data object JNull : JValue {
    override fun toString(): String = "null"
}

data class JBoolean(val value: Boolean) : JValue {
    override fun toString(): String = value.toString()
}

data class JNumber(val value: Number) : JValue {
    override fun toString(): String = value.toString()
}

data class JString(val value: String) : JValue {
    override fun toString(): String = value
}

data class JArray(val elements: List<JValue>) : JValue {
    fun validateTypes() {
        if (elements.isNotEmpty()) {
            for (element in elements.subList(1, elements.size)) {
                if (element.javaClass != elements[0].javaClass) {
                    throw Exception("Array elements must be of the same type.")
                }
            }
        }
    }
    
    fun flatten(): JArray {
        val flatList: MutableList<JValue> = mutableListOf()

        for (element in this.elements) {
            if (element is JArray) {
                flatList.addAll(element.flatten().elements)
            } else {
                flatList.add(element)
            }
        }

        return JArray(flatList)
    }

    fun toString(indent: String): String {
        val jsonElements = elements.joinToString(",\n") {
            "$indent  ${(it as? JObject)?.toString("$indent  ") ?: (it as? JArray)?.toString("$indent  ") ?: it}"
        }
        return "[\n$jsonElements\n$indent]"
    }

    override fun toString(): String = toString("")
}

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
            { "a": [1.3, 2, 44.5], "aa": 3, "c": {"a": "abc", "b": "cba", "c": {"x": {}, "u": 15.2, "z": [1, 2, 3.0, -5, -3.3] } } }
        """.trimIndent()

    val lexer = JsonLexer(CharStreams.fromString(text))
    val parser = JsonParser(CommonTokenStream(lexer))
    val test: JValue = parser.jValue().toAst()
    println("Valid Object fields: ${test.validate()}")

    println(test)
    println()
}