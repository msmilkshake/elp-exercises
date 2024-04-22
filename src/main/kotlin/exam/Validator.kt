package exam

fun JValue.validateFields(): Boolean {
    when {
        this is JObject -> {
            val fieldNames: MutableSet<String> = mutableSetOf()
            fields.forEach {
                if (fieldNames.contains(it.name)) {
                    return false
                }
                fieldNames.add(it.name)
            }
            fields.forEach { 
                if (it.value is JObject || it.value is JArray) {
                    return it.value.validateFields()
                }
            }
        }
        this is JArray -> {
            elements.forEach { 
                return it.validateFields()
            }
        }
    }
    return true
}

fun JValue.validateArrayType(): Boolean {
    when {
        this is JArray -> {
            if (elements.isNotEmpty()) {
                for (element in elements.subList(1, elements.size - 1)) {
                    println(element.javaClass)
                    println(elements[0].javaClass)
                    if (element.javaClass != elements[0].javaClass) {
                        return false
                    }
                    if (element is JArray) {
                        return element.validateArrayType()
                    }
                }
            }
        }
        this is JObject -> {
            fields.forEach {
                if (it.value is JArray) {
                    return it.value.validateArrayType()
                }
            }
        }
    }
    return true
}