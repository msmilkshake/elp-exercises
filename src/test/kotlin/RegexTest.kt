import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import week1.jsonRgx

class RegexTest {
    @Test
    fun testJsonArray() {
        assertFalse(jsonRgx.matches("[123 456]"))
        assertFalse(jsonRgx.matches("[123 \"456\"]"))
        assertFalse(jsonRgx.matches("[wrong]"))
        assertFalse(jsonRgx.matches("[ false ]"))
        assertFalse(jsonRgx.matches("[12, 34,]"))
        assertFalse(jsonRgx.matches("[12, \"abc\", true]"))
        assert(jsonRgx.matches("[]"))
        assert(jsonRgx.matches("[ ]"))
        assert(jsonRgx.matches("[\"\"]"))
        assert(jsonRgx.matches("[ \"\"   ]"))
        assert(jsonRgx.matches("[123]"))
        assert(jsonRgx.matches("[\"abc\"]"))
        assert(jsonRgx.matches("[12,34,56]"))
        assert(jsonRgx.matches("[12, 34, 56]"))
        assert(jsonRgx.matches("[12  , 34  , 56]"))
        assert(jsonRgx.matches("[\"ab cd\",\"ef gh\",\"ijkl\",\"\"]"))
        assert(jsonRgx.matches("[\"ab cd\", \"ef gh\", \"ijkl\", \"\"]"))
        assert(jsonRgx.matches("[ \"ab cd\"  ,   \"ef gh\"  ,  \"ijkl\" , \"\"  ]"))
        assert(jsonRgx.matches("[ \"ab cd\"  ,   \"ef gh\"  ,  \"ijkl\" , \"\"  ]"))
        assert(jsonRgx.matches("[\"ab cd\", 123,  \"ef gh\"  , 0  , \"ijkl\" , \"\", 99872]"))
    }
}