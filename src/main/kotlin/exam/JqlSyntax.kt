package exam

import exam.JQLParser.*

fun ScriptContext.toAst(): Script =
    Script(this.sequence().instruction().map { it.toAst() }, listOf())

fun InstructionContext.toAst(): Instruction =
    when {
        this.assign() != null -> Assign(this.assign().variable().text, this.assign().expression().toAst())
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

fun ExpressionContext.toAst(): Expression =
    when {
        this.accessor() != null -> {
            val accessorContext = this.accessor()
            val variable = accessorContext.variable().text
            val keys = accessorContext.key().map { Key(it.ID().text, it.finder() != null) }
            Accessor(variable, keys)
        }
        else -> throw IllegalArgumentException("Cannot convert $this to Ast")
    }


    