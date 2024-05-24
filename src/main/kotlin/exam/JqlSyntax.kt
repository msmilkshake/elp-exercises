package exam

import exam.JQLParser.*

fun ScriptContext.toAst(): Script =
    Script(this.sequence().instruction().map { it.toAst() }, listOf())

fun InstructionContext.toAst(): Instruction =
    when {
        this.assign() != null -> this.assign().toAst()
        this.load() != null -> this.load().toAst()
        this.save() != null -> this.save().toAst()

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

fun SaveContext.toAst(): Save =
    when {
        this.arg() != null -> Save(
            this.variable().text,
            Arg(this.arg().INT().text.toInt())
        )

        this.STR() != null -> Save(
            this.variable().text,
            Filename(this.STR().text.trim('"'))
        )

        else -> throw IllegalArgumentException("Cannot convert $this to Ast")
    }

fun AssignContext.toAst(): Assign = Assign(this.variable().text, this.expression().toAst())

fun ExpressionContext.toAst(): Expression {
    val expression = when {
        this.accessor() != null -> this.accessor().toAst()
        this.jqValue() != null -> this.jqValue().toAst()

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

fun JqObjectContext.toAst(): JQObject =
    JQObject(jqField().map {
        JQField(it.name().text, it.jqValue().toAst())
    })

fun JqArrayContext.toAst(): JQArray =
    JQArray(jqValue().map {
        when {
            it.jqObject() != null -> it.jqObject().toAst()
            it.jqArray() != null -> JQArray(
                it.jqArray().jqValue().map { it2 ->
                    it2.toAst()
                }
            )
            it.jqVar() != null -> JQVar(it.jqVar().text)
            it.jqString() != null -> JQString(it.text)
            it.jqNumber() != null -> JQNumber(it.text.toFloat())
            it.jqBoolean() != null -> JQBoolean(it.text.toBoolean())
            it.jqNull() != null -> JQNull

            else -> throw IllegalArgumentException("Cannot convert $this to Ast: ${this.text}")
        }
    })

fun JqValueContext.toAst(): JQValue =
    when {
        jqNull() != null -> JQNull
        jqNumber() != null -> JQNumber(jqNumber().text.toDouble())
        jqBoolean() != null -> JQBoolean(jqBoolean().text.toBoolean())
        jqString() != null -> JQString(jqString().text)
        jqArray() != null -> jqArray().toAst()
        jqObject() != null -> jqObject().toAst()
        jqVar() != null -> JQVar(jqVar().text)

        else -> throw IllegalArgumentException("Cannot convert $this to Ast")
    }
