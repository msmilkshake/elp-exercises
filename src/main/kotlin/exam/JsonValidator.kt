package exam

fun JValue.validate(): Boolean {
    return when (this) {
        is JObject -> {
            try {
                this.validateNames()
            } catch (ex: Exception) {
                System.err.println(ex)
                return false
            }

            fields.all { it.value.validate() }
        }
        is JArray -> {
            try {
                this.validateTypes()
            }  catch (ex: Exception) {
                System.err.println(ex)
                return false
            }

            elements.all { it.validate() }
        }
        else -> true
    }
}