package exam

import exam.JQLParser.*

fun ScriptContext.toAst(): Script =
    Script(this.sequence().instruction().map { it.toAst() }, listOf())

fun InstructionContext.toAst(): Instruction =
    when {
        this.assign() != null -> this.assign().toAst()
        this.load() != null -> this.load().toAst()
        this.save() != null -> TODO()
        else -> throw IllegalArgumentException("Cannot convert $this to Ast")
    }

fun LoadContext.toAst(): Load =
    when {
        this.arg() != null -> Load(
            Arg(this.arg().INT().text.toInt()),
            this.variable().text
        )

        this.STR() != null -> Load(
            Filename(this.STR().text.trim('"')),
            this.variable().text
        )

        else -> throw IllegalArgumentException("Cannot convert $this to Ast")
    }

fun AssignContext.toAst(): Assign = Assign(this.variable().text, this.expression().toAst())

fun ExpressionContext.toAst(): Expression {
    val expression = when {
        this.accessor() != null -> this.accessor().toAst()

        else -> throw IllegalArgumentException("Cannot convert $this to Ast")
    }
    val aggregator =
        if (this.aggregator() != null) this.aggregator().toAst()
        else null

    return if (aggregator != null) AggregatedExpression(expression, aggregator) else expression
}

fun AccessorContext.toAst(): Accessor {
    val variable = variable().text
    val keys = key().map { Key(it.ID().text, it.finder() != null) }
    return Accessor(variable, keys)
}

fun AggregatorContext.toAst(): Aggregator =
    when (this.AGGREGATORS().text) {
        "max" -> Aggregator.MAX
        "min" -> Aggregator.MIN
        "count" -> Aggregator.COUNT
        "sum" -> Aggregator.SUM
        "avg" -> Aggregator.AVG
        else -> throw IllegalArgumentException("Cannot convert $this to Ast")
    }



    