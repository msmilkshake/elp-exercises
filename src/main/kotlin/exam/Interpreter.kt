package exam

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.nio.file.Files
import java.nio.file.Paths

class Interpreter(scriptFilename: String) {
    val script: Script = loadScript(scriptFilename)

    val memory = mutableMapOf<String, JValue>()
    val args: MutableList<String> = mutableListOf()

    fun run(vararg args: String) {
        args.forEach { arg ->
            this.args.add(arg)
        }
        executeInstructions(script.instructions)
    }

    fun executeInstructions(instructions: List<Instruction>) {
        instructions.forEach { instruction ->
            println(instruction)
            when (instruction) {
                is Load -> {
                    val filename =
                        when (val file = instruction.file) {
                            is Arg -> {
                                if (file.number >= args.size) {
                                    throw IllegalArgumentException("Argument $${file.number} doesn't exist. Passed arguments: ${args.size}")
                                }
                                args[file.number]
                            }

                            is Filename -> file.value
                        }
                    loadJson(filename, instruction.varId)
                }

                is Save -> {
                    val filename =
                        when (val file = instruction.file) {
                            is Arg -> args[file.number]
                            is Filename -> file.value
                        }
                    saveJson(filename, instruction.varId)
                }

                is Assign -> {
                    when (val expr = instruction.expression) {
                        is Accessor -> {
                            val result = getFromMemory(expr.varId, expr.keys)
                            memory[instruction.varId] = result
                        }

                        is AggregatedExpression -> {
                            if (expr.expression is Accessor) {
                                val accessor = expr.expression
                                val accessorResult = getFromMemory(accessor.varId, accessor.keys)
                                val result = when (accessorResult) {
                                    is JArray -> aggregateResult(accessorResult, expr.aggregator)
                                    else -> throw Exception("Aggregator operators can only be applied to arrays.")
                                }
                                memory[instruction.varId] = result
                            }
                        }

                        is JQValue -> {
                            val jValue = when (expr) {
                                is JQNumber -> JNumber(expr.value)
                                is JQString -> JString(expr.value)
                                is JQBoolean -> JBoolean(expr.value)
                                is JQNull -> JNull
                                is JQArray -> JArray(expr.elements.map { convertJQValueToJValue(it) })
                                is JQObject -> JObject(expr.fields.map {
                                    JField(
                                        it.name,
                                        convertJQValueToJValue(it.value)
                                    )
                                })

                                is JQVar -> memory[expr.varId]
                                    ?: throw IllegalArgumentException("Variable ${expr.varId} isn't defined.")
                            }
                            memory[instruction.varId] = jValue
                        }

                    }
                }
            }
        }
    }

    fun convertJQValueToJValue(jqValue: JQValue): JValue {
        return when (jqValue) {
            is JQNumber -> JNumber(jqValue.value)
            is JQString -> JString(jqValue.value)
            is JQBoolean -> JBoolean(jqValue.value)
            is JQNull -> JNull
            is JQArray -> JArray(jqValue.elements.map { convertJQValueToJValue(it) })
            is JQObject -> JObject(jqValue.fields.map { JField(it.name, convertJQValueToJValue(it.value)) })
            is JQVar -> memory[jqValue.varId] ?: throw IllegalArgumentException("Variable ${jqValue.varId} isn't defined.")
        }
    }

    fun loadScript(filename: String): Script {
        val scriptString = Files.readString(Paths.get(filename))
        val lexer = JQLLexer(CharStreams.fromString(scriptString))
        val parser = JQLParser(CommonTokenStream(lexer))
        val script = parser.script().toAst()
        val errors = script.validate()
        if (errors.isNotEmpty()) {
            errors.map { error ->
                System.err.println("Unresolved reference: ${error.varId} is not declared (Line ${error.instruction})")
            }
            throw Exception("The script has Compile Errors and can't be ran by the interpreter.")
        }
        return script
    }

    fun loadJson(filename: String, varId: String) {
        val jsonString = Files.readString(Paths.get(filename))
        val lexer = JsonLexer(CharStreams.fromString(jsonString))
        val parser = JsonParser(CommonTokenStream(lexer))
        val json = parser.jValue().toAst()
        memory[varId] = json
        println("------- LOADED JSON ---------")
        println(json)
        println()
    }

    fun saveJson(filename: String, varId: String) {
        val jsonString = memory[varId].toString()
        Files.writeString(Paths.get(filename), jsonString)
        println("-------- SAVED JSON ---------")
        println(jsonString)
        println()
    }

    fun getFromMemory(varId: String, keys: List<Key>): JValue {
        var value: JValue = memory[varId]
            ?: throw Exception("Variable $varId doesn't exist in memory.")

        var find = false

        for (key in keys) {
            value = when {
                value is JObject -> value.fields.find { it.name.trim('"') == key.id }?.value
                    ?: throw Exception("Key ${key.id} doesn't exist in variable $varId.")

                value is JArray && find -> {
                    find = false

                    JArray(value.elements.flatMap {
                        when (it) {
                            is JObject -> it.fields.find { it.name.trim('"') == key.id }?.value?.let { listOf(it) }
                                ?: listOf()

                            else -> throw Exception("Cannot get property ${key.id} in array variable $varId.")
                        }
                    }).flatten()
                }

                else -> throw Exception("Cannot get property ${key.id} of variable $varId.")
            }
            if (key.isFinder) {
                find = true;
            }
        }

        return value
    }

    fun aggregateResult(list: JArray, aggregator: Aggregator): JValue =
        when (aggregator) {

            Aggregator.MAX -> {
                val max = list.elements.maxByOrNull {
                    if (it is JNumber) it.value.toDouble()
                    else throw IllegalArgumentException("Max must be applied to numbers.")
                }
                max ?: throw IllegalArgumentException("Max can't be applied to empty array.")
            }

            Aggregator.MIN -> {
                val min = list.elements.minByOrNull {
                    if (it is JNumber) it.value.toDouble()
                    else throw IllegalArgumentException("Min must be applied to numbers.")
                }
                min ?: throw IllegalArgumentException("Min can't be applied to empty array.")
            }

            Aggregator.COUNT -> JNumber(list.elements.size.toDouble())

            Aggregator.SUM -> {
                val sum = list.elements.fold(0.0) { acc, element ->
                    when (element) {
                        is JNumber -> acc + element.value.toDouble()
                        else -> throw IllegalArgumentException("Sum must be applied to numbers.")
                    }
                }
                JNumber(sum)
            }

            Aggregator.AVG -> {
                val sum = list.elements.fold(0.0) { acc, element ->
                    when (element) {
                        is JNumber -> acc + element.value.toDouble()
                        else -> throw IllegalArgumentException("Avg must be applied to numbers.")
                    }
                }
                if (list.elements.isNotEmpty()) {
                    JNumber(sum / list.elements.size)
                } else {
                    throw IllegalArgumentException("Array cannot be empty for Avg operation.")
                }
            }
        }

}