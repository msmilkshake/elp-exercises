package exam

data class Script(
    val instructions: List<Instruction>,
    val parameters: List<String>
) {
    fun validate(): List<VarError> {
        val errors: MutableList<VarError> = mutableListOf()
        val varIds: MutableSet<String> = parameters.toMutableSet()
        return errors
    }
}

data class VarError(
    val varId: String,
    val line: Int
)

sealed interface Instruction {}

data class Load(
    val file: String,
    val varId: String
): Instruction

data class Save(
    val varId: String,
    val file: String
): Instruction


enum class Aggregator {
    MAX,
    MIN,
    COUNT,
    SUM,
    AVG
}


sealed interface QJValue {}

data class QJField(val name: String, val value: JValue) {}

data class QJObject(val fields: List<JField>): JValue {
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

data class QJArray(val elements: List<JValue>): JValue {
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

data object QJNull : JValue {}

data class QJBoolean(val value: Boolean): JValue {}

data class QJNumber(val value: Number): JValue {}

data class QJString(val value: String): JValue {}

data class QJVar(val id: String): JValue {}
