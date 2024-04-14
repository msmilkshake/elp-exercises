package week5

import week5.SintraParser.*

fun ScriptContext.toAst(): Script =
    Script(this.instruction().map { it.toAst() }, listOf())

fun InstructionContext.toAst(): Instruction =
    when {
        this.assign() != null -> this.assign().toAst()
        this.print() != null -> this.print().toAst()
        else -> throw IllegalArgumentException("Cannot convert $this to Ast")
    }

fun AssignContext.toAst(): Assign =
    Assign(this.variable().text, this.expression().toAst())

fun ExpressionContext.toAst(): Expression =
    when(this) {
        is LiteralExpressionContext -> Literal(this.text.toInt())
        is VariableExpressionContext -> Variable(this.text)
        is BinaryExpressionContext ->  {
            if (this.left is LiteralExpressionContext && this.right is LiteralExpressionContext) {
                Literal(when (this.OPERATOR_MUL_DIV()?.text ?: this.OPERATOR_ADD_SUB()?.text) {
                    "+" -> this.left.text.toInt() + this.right.text.toInt()
                    "-" -> this.left.text.toInt() - this.right.text.toInt()
                    "*" -> this.left.text.toInt() * this.right.text.toInt()
                    "/" -> this.left.text.toInt() / this.right.text.toInt()
                    else -> throw IllegalStateException("Cannot convert $this to Ast")
                })
            } else {
                BinaryExpression(this.left.toAst(),
                    when (this.OPERATOR_MUL_DIV()?.text ?: this.OPERATOR_ADD_SUB()?.text) {
                        "+" -> Operator.PLUS
                        "-" -> Operator.MINUS
                        "*" -> Operator.TIMES
                        "/" -> Operator.DIVIDE
                        else -> throw IllegalStateException("Cannot convert $this to Ast")
                    },
                    this.right.toAst()
                )
            }
        }
        is ParenthesisExpressionContext -> this.expression().toAst()
        else -> throw IllegalStateException("Cannot convert $this to Ast")
    }

fun PrintContext.toAst(): Print =
    Print(this.expression().toAst())