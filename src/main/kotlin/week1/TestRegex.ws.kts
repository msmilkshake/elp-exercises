package week1

val regex = Regex("<[a-z]+>")
regex.matches("<tag>")
regex.matches("<>")

// Exercise A

// 1.
val regex1 = Regex("[01]+")
regex1.matches("100111")

// 2.
val regex2 = Regex("[a-zA-Z\$][a-zA-Z0-9_\$]*|_[a-zA-Z0-9_\$]+")
regex2.matches("")
regex2.matches("_")
regex2.matches("0abc")
regex2.matches("0ABC")
regex2.matches("a0b2")
regex2.matches("\$")
regex2.matches("___abc")
regex2.matches("\$\$\$abc")
regex2.matches("_\$_\$abc$")
regex2.matches("_\$")
regex2.matches("\$_")
regex2.matches("__")
regex2.matches("\$\$")

// 3.
val regex3Pascal = Regex("[A-Z][a-z]*([A-Z0-9][a-z0-9]*)*")
regex3Pascal.matches("")
regex3Pascal.matches("helloWorld")
regex3Pascal.matches("snake_case")
regex3Pascal.matches("HelloWorld")
regex3Pascal.matches("IOException")
regex3Pascal.matches("Ioexception")
regex3Pascal.matches("YMCA")
regex3Pascal.matches("YMCAClass")
regex3Pascal.matches("YMCA_Class")

val regex3Camel = Regex("[a-z][a-z0-9]*([A-Z][a-z0-9]*)*")
regex3Camel.matches("")
regex3Camel.matches("helloWorld")
regex3Camel.matches("the3Variables")
regex3Camel.matches("value")
regex3Camel.matches("1nv4l1dC4m3lC4s3")
regex3Camel.matches("Inv4l1dC4m3lC4s3")
regex3Camel.matches("v4l1dC4m3lC4s3")
regex3Camel.matches("ThisIsPascalCase")
regex3Camel.matches("thisIsCamelCase")
regex3Camel.matches("camelCase")
regex3Camel.matches("camelCaseWith4Numbers3")
regex3Camel.matches("snake_case")
regex3Camel.matches("Edgy_Snake_Case")
regex3Camel.matches("HelloWorld")
regex3Camel.matches("IOException")
regex3Camel.matches("instanceOfIOException")
regex3Camel.matches("Ioexception")

// 4.
val regex4 = Regex("public|protected|private")
regex4.matches("public")
regex4.matches("protected")
regex4.matches("private")
regex4.matches("something else")
regex4.matches("")
regex4.matches("protecetd")
regex4.matches("12345")

// 5.
val regex5 = Regex("</?\\w+>")
regex5.matches("<doc")
regex5.matches("doc>")
regex5.matches("<//doc>")
regex5.matches("<doc>")
regex5.matches("</doc>")

// 6.
val regex6 = Regex("\\d+(\\.\\d+)?")
regex6.matches("")
regex6.matches("a34.123")
regex6.matches("34.12s3")
regex6.matches("abc")
regex6.matches("abc.abc")
regex6.matches("3422.")
regex6.matches("3422")
regex6.matches("0")
regex6.matches("0.23345")
regex6.matches("123.9876543")

// 7.
val regex7 = Regex("(\\d{2}-){2}\\d{4}")
regex7.matches("13-12-2023")

// 8.
val regex8 = Regex("\"[^\"]*\"")
regex8.matches("Not a string")
regex8.matches("857 dfg dgf32jh #$%  ag , %$&..,+ 325")
regex8.matches("\"Broken \" String\"")
regex8.matches("\"\"")
regex8.matches("\"A String\"")
regex8.matches("\"4n0'-.wefo jsfiues8rw357 %&\"")

// 9.
val regex9 = Regex("(\\d+,\\s*)*\\d+")
regex9.matches("")
regex9.matches("1, 23,  4,   77,")
regex9.matches("1")
regex9.matches("1,23,4,77")
regex9.matches("1, 23,  4,   77")

// 10.
val regex10 = Regex("\\[(\\s*((\\d+|\"[^\"]*\")\\s*,\\s*)*(\\d+|\"[^\"]*\")+)?\\s*\\]")
regex10.matches("[123 456]")
regex10.matches("[123 \"456\"]")
regex10.matches("[wrong]")
regex10.matches("[ false ]")
regex10.matches("[12, 34,]")
regex10.matches("[12, \"abc\", true]")
regex10.matches("[]")
regex10.matches("[ ]")
regex10.matches("[\"\"]")
regex10.matches("[ \"\"   ]")
regex10.matches("[123]")
regex10.matches("[\"abc\"]")
regex10.matches("[12,34,56]")
regex10.matches("[12, 34, 56]")
regex10.matches("[12  , 34  , 56]")
regex10.matches("[\"ab cd\",\"ef gh\",\"ijkl\",\"\"]")
regex10.matches("[\"ab cd\", \"ef gh\", \"ijkl\", \"\"]")
regex10.matches("[ \"ab cd\"  ,   \"ef gh\"  ,  \"ijkl\" , \"\"  ]")
regex10.matches("[ \"ab cd\"  ,   \"ef gh\"  ,  \"ijkl\" , \"\"  ]")
regex10.matches("[\"ab cd\", 123,  \"ef gh\"  , 0  , \"ijkl\" , \"\", 99872]")

// 11.
val regex11 = Regex("\\(\\+\\d{3}\\) \\d{9}")
regex11.matches("(+)")
regex11.matches("(+351) 919223556")

