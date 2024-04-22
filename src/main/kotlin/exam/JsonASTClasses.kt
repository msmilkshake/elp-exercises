package exam

sealed interface JValue {}

data class JField(val name: String, val value: JValue) {}

data class JObject(val fields: List<JField>): JValue {
    fun validateNames() {
        val fieldNames: MutableSet<String> = mutableSetOf()
        fields.forEach { 
            if (fieldNames.contains(it.name)) {
                throw Exception("Object has repeated name: ${it.name}")
            }
            fieldNames.add(it.name)
        }
    }
}

data object JNull : JValue {}

data class JBoolean(val value: Boolean): JValue {}

data class JNumber(val value: Number): JValue {}

data class JString(val value: String): JValue {}

data class JArray(val elements: List<JValue>): JValue {
    fun validateTypes() {
        if (elements.isNotEmpty()) {
            for (element in elements.subList(1, elements.size - 1)) {
                if (element.javaClass != elements[0].javaClass) {
                    throw Exception("Array elements must be of the same type.")
                }
            }
        }
    }
}