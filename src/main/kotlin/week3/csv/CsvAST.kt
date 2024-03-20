package week3.csv

import kotlin.Number
import kotlin.String


data class CSV(val lines: List<CsvLine>) {
    fun toText(): String = lines.joinToString(separator = "\n") {
        it.elements.joinToString { it.toText() }
    }
}
data class CsvLine(val elements: List<CsvElement>)
interface CsvElement {
    fun toText(): String
}
data class CsvBool(val value: Boolean): CsvElement {
    override fun toText(): String {
        return value.toString()
    }
}

data class CsvNumber(val value: Number): CsvElement {
    override fun toText(): String {
        return value.toString()
    }
}

data class CsvString(val value: String): CsvElement {
    override fun toText(): String {
        return "\"" + value + "\""
    }
}

object CsvNone: CsvElement {
    override fun toText(): String {
        return ""
    }
}