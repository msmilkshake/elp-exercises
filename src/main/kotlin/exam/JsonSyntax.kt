package exam

import exam.JsonParser.*

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
