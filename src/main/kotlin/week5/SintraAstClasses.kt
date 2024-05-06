package week5

data class Script(
    val instructions: List<Instruction>,
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

        fun validateInstructions(instructuons: List<Instruction>) {
            instructuons.forEachIndexed { i, instruction ->
                when (instruction) {
                    is Assign -> {
                        checkErrors(instruction.expression, i)
                        varIds.add(instruction.varId)
                    }

                    is Print ->
                        checkErrors(instruction.expression, i)

                    is IfElse -> {
                        checkErrors(instruction.guard, i)
                        validateInstructions(instruction.sequence)
                        validateInstructions(instruction.alternative)
                    }

                    is While -> {
                        checkErrors(instruction.guard, i)
                        validateInstructions(instruction.sequence)
                    }
                }
            }
        }

        validateInstructions(instructions)
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
        is Literal -> emptyList()
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

sealed interface ControlStructure : Instruction {
    val sequence: List<Instruction>
    val guard: Expression
}

data class IfElse(
    override val sequence: List<Instruction>,
    override val guard: Expression,
    val alternative: List<Instruction>
) : ControlStructure

data class While(
    override val sequence: List<Instruction>,
    override val guard: Expression,
) : ControlStructure

enum class Operator {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE,
    MOD,
    LTE,
    LT,
    EQ,
    GT,
    GTE,
    AND,
    OR;

    fun isArithmetic(): Boolean =
        when (this) {
            PLUS, MINUS, TIMES, DIVIDE, MOD -> true
            else -> false
        }
}

class Interpreter(val script: Script) {
    val memory = mutableMapOf<String, Int>()

    fun run(vararg parameters: Pair<String, Int>) {
        parameters.forEach { p ->
            memory[p.first] = p.second
        }
        fun executeInstructions(instructions: List<Instruction>) {
            instructions.forEach { instruction ->
                when (instruction) {
                    is Assign -> memory[instruction.varId] = instruction.expression.calculate()

                    is Print -> println(instruction.expression.calculate())

                    is IfElse -> {
                        if (instruction.guard.calculate() != 0) {
                            executeInstructions(instruction.sequence)
                        } else {
                            executeInstructions(instruction.alternative)
                        }
                    }

                    is While -> {
                        while (instruction.guard.calculate() != 0) {
                            executeInstructions(instruction.sequence)
                        }
                    }
                }
            }
        }
        executeInstructions(script.instructions)

    }
    // Em vez de devolvere void, devolver qq coisa que propaga até um while.

    fun Expression.calculate(): Int =
        when (this) {
            is Literal -> this.value
            is Variable -> memory[this.varId] ?: throw Exception("Value not declared")
            is BinaryExpression -> when (this.operator) {
                Operator.PLUS -> this.left.calculate() + this.right.calculate()
                Operator.MINUS -> this.left.calculate() - this.right.calculate()
                Operator.TIMES -> this.left.calculate() * this.right.calculate()
                Operator.DIVIDE -> {
                    val right = this.right.calculate()
                    if (right == 0) throw Exception("Division by zero")
                    this.left.calculate() / right
                }

                Operator.MOD -> this.left.calculate() % this.right.calculate()
                Operator.LT -> if (this.left.calculate() < this.right.calculate()) 1 else 0
                Operator.LTE -> if (this.left.calculate() <= this.right.calculate()) 1 else 0
                Operator.EQ -> if (this.left.calculate() == this.right.calculate()) 1 else 0
                Operator.GTE -> if (this.left.calculate() >= this.right.calculate()) 1 else 0
                Operator.GT -> if (this.left.calculate() > this.right.calculate()) 1 else 0
                Operator.AND -> if (this.left.calculate() != 0 && this.right.calculate() != 0) 1 else 0
                Operator.OR -> if (this.left.calculate() != 0 || this.right.calculate() != 0) 1 else 0
            }
        }
}