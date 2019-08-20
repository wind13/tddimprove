package io.github.wind13.tddimprove.args03

class Parser(val type: String) {

    private fun trimToStr(it: String) = it.trim()
    private fun trimToBool(it: String) = it.trim().toBoolean()
    private fun trimToInt(it: String) = it.trim().toInt()
    private fun trimToStrs(input: String) = input.split(",").map { trimToStr(it) }
    private fun trimToBools(input: String) = input.split(",").map { trimToBool(it) }
    private fun trimToInts(input: String) = input.split(",").map { trimToInt(it) }

    fun parse(input: String): Any {
        return when (type) {
            "int" -> trimToInt(input)
            "bool" -> trimToBool(input)
            "int[]" -> trimToInts(input)
            "bool[]" -> trimToBools(input)
            "str[]" -> trimToStrs(input)
            else -> trimToStr(input)
        }
    }
}
