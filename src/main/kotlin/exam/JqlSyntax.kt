package exam

import exam.JQLParser.*

fun ScriptContext.toAst(): Script =
    Script(this.sequence().instruction().map { it.toAst() }, listOf())

fun InstructionContext.toAst(): Instruction =
    when {
        this.assign() != null -> TODO()
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