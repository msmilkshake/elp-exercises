import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.junit.jupiter.api.Assertions.assertEquals
import week3.csv.*
import kotlin.test.Test

class ParserTest {
    @Test
    fun test() {
        val text = """
           "Alan Kay", 1940, ,true
           "Donald Knuth", 1938, ,true
           "Alan Turing", 1912, 1954, false
       """.trimIndent()


        val expected = CSV(listOf(
            CsvLine(listOf(CsvString("Alan Kay"), CsvNumber(1940.0), CsvNone, CsvBool(true))),
            CsvLine(listOf(CsvString("Donald Knuth"), CsvNumber(1938.0), CsvNone, CsvBool(true))),
            CsvLine(listOf(CsvString("Alan Turing"), CsvNumber(1912.0), CsvNumber(1954.0), CsvBool(false)))
        ))
        val lexer = CsvLexer(CharStreams.fromString(text))
        val parser = CsvParser(CommonTokenStream(lexer))
        val csvContext = parser.csv()
        val csv = csvContext.toAst()
        assertEquals(expected, csv)
    }

}