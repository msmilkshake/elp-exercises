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
            when (instruction) {
                is Load -> {
                    val filename =
                        when (instruction.file) {
                            is Arg -> args[instruction.file.number]
                            is Filename -> instruction.file.value
                        }
                    loadJson(filename, instruction.varId)
                }

                is Save -> TODO()
            }
        }
    }

    fun loadScript(filename: String): Script {
        val scriptString = Files.readString(Paths.get(filename))
        val lexer = JQLLexer(CharStreams.fromString(scriptString))
        val parser = JQLParser(CommonTokenStream(lexer))
        return parser.script().toAst()
    }

    fun loadJson(filename: String, varId: String) {
        val jsonString = Files.readString(Paths.get(filename))
        val lexer = JsonLexer(CharStreams.fromString(jsonString))
        val parser = JsonParser(CommonTokenStream(lexer))
        val json = parser.jObject().toAst()
        memory[varId] = json
        println("------- JSON ---------")
        println(json)
    }

    fun saveJson(filename: String, varId: String) {
        val jsonString = Files.readString(Paths.get(filename))
        val lexer = JsonLexer(CharStreams.fromString(jsonString))
        val parser = JsonParser(CommonTokenStream(lexer))
        val json = parser.jObject().toAst()
        memory[varId] = json
    }
}