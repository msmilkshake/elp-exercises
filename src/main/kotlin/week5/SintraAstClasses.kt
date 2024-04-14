package week5

data class Script(
    val instructuons: List<Instruction>,
    val parameters: List<String>
) {
    fun validate(): List<VarError> {
        val errors: MutableList<VarError> = mutableListOf()
        val varIds: MutableSet<String> = parameters.toMutableSet()
        fun checkErrors(expression: Expression, i: Int) {
            expression.varReferences().forEach { varId ->
                if (varId !in varIds) {
                    errors.add(VarError(varId, i))
                }
            }
        }
        instructuons.forEachIndexed { i, instruction ->
            when (instruction) {
                is Assign -> {
                    checkErrors(instruction.expression, i)
                    varIds.add(instruction.varId)
                }

                is Print ->
                    checkErrors(instruction.expression, i)
            }
        }
        return errors
    }
}

data class VarError(
    val varId: String,
    val line: Int
)

sealed interface Instruction {}

data class Assign(
    val varId: String,
    val expression: Expression
) : Instruction

data class Print(
    val expression: Expression
) : Instruction

sealed interface Expression {
    fun varReferences(): List<String> = when (this) {
        is Literal -> emptyList<String>()
        is Variable -> listOf(this.varId)
        is BinaryExpression -> this.left.varReferences() + this.right.varReferences()
    }
}

data class Literal(
    val value: Int
) : Expression

data class Variable(
    val varId: String
) : Expression

data class BinaryExpression(
    val left: Expression,
    val operator: Operator,
    val right: Expression
) : Expression

enum class Operator {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE
}

class Interpreter(val script: Script) {
    val memory = mutableMapOf<String, Int>()
    
    fun run(vararg parameters: Pair<String, Int>) {
        parameters.forEach { p ->
            memory[p.first] = p.second
        }
        
        script.instructuons.forEach { instruction ->
            when (instruction) {
                is Assign -> memory[instruction.varId] = instruction.expression.calculate()
                is Print -> println(instruction.expression.calculate())
            }
        }
        
    }
    
    fun Expression.calculate(): Int =
        when (this) {
            is Literal -> this.value
            is Variable -> memory[this.varId] ?: throw Exception("Value not declared")
            is BinaryExpression ->  when(this.operator) {
                Operator.PLUS -> this.left.calculate() + this.right.calculate()
                Operator.MINUS -> this.left.calculate() - this.right.calculate()
                Operator.TIMES -> this.left.calculate() * this.right.calculate()
                Operator.DIVIDE -> {
                    val right = this.right.calculate()
                    if (right == 0) throw Exception("Division by zero")
                    this.left.calculate() / right
                }
            }
        }
}