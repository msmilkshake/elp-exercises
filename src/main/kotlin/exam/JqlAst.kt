package exam

data class Script(
    val instructions: List<Instruction>,
    val args: List<String>
) {
    fun validate(): List<VarError> {
        val errors: MutableList<VarError> = mutableListOf()
        val varIds: MutableSet<String> = args.toMutableSet()

        fun checkErrors(expression: Expression, i: Int) {
            when (expression) {
                is Accessor -> {
                    if (expression.varId !in varIds) {
                        errors.add(VarError(expression.varId, i))
                    }
                }
                
                is JQVar -> {
                    if (expression.varId !in varIds) {
                        errors.add(VarError(expression.varId, i))
                    }
                }
                
                is AggregatedExpression -> {
                    checkErrors(expression.expression, i)
                }

                is JQObject -> {
                    expression.fields.forEach { field ->
                        checkErrors(field.value, i)
                    }
                }

                is JQArray -> {
                    expression.elements.forEach { element ->
                        checkErrors(element, i)
                    }
                }
                
                else -> {}
            }
        }

        instructions.forEachIndexed { i, instruction ->
            when (instruction) {
                is Assign -> {
                    checkErrors(instruction.expression, i)
                    varIds.add(instruction.varId)
                }

                is Load -> {
                    varIds.add(instruction.varId)
                }

                is Save -> {
                    checkErrors(Accessor(instruction.varId, emptyList()), i)
                }
            }
        }
        
        return errors
    }
}

data class VarError(
    val varId: String,
    val instruction: Int
)

sealed interface FileArg

data class Filename(
    val value: String
) : FileArg

data class Arg(
    val number: Int
) : FileArg

sealed interface Instruction

data class Load(
    val file: FileArg,
    val varId: String
) : Instruction

data class Save(
    val varId: String,
    val file: FileArg
) : Instruction

data class Assign(
    val varId: String,
    val expression: Expression
) : Instruction

sealed interface Expression

data class AggregatedExpression(
    val expression: Expression,
    val aggregator: Aggregator
) : Expression

data class Accessor(
    val varId: String,
    val keys: List<Key>
) : Expression

data class Key(
    val id: String,
    val isFinder: Boolean = false
)


enum class Aggregator {
    MAX,
    MIN,
    COUNT,
    SUM,
    AVG
}


sealed interface JQValue : Expression

data class JQField(val name: String, val value: JQValue)

data class JQObject(val fields: List<JQField>) : JQValue {
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

data class JQArray(val elements: List<JQValue>) : JQValue

data object JQNull : JQValue

data class JQBoolean(val value: Boolean) : JQValue

data class JQNumber(val value: Number) : JQValue

data class JQString(val value: String) : JQValue

data class JQVar(val varId: String) : JQValue
