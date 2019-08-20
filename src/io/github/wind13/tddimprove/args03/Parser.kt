package io.github.wind13.tddimprove.args03

class Parser(val type: String) {
    fun parse(strValue: String): Any {
        return when (type) {
            "int" -> trimToInt(strValue)
            "bool" -> trimToBool(strValue)
            "int[]" -> strValue.split(",").map { trimToInt(it) }
            "bool[]" -> strValue.split(",").map { trimToBool(it) }
            "str[]" -> strValue.split(",").map { trimToStr(it) }
            else -> trimToStr(strValue)
        }
    }

    private fun trimToStr(it: String) = it.trim()

    private fun trimToBool(it: String) = it.trim().toBoolean()

    private fun trimToInt(it: String) = it.trim().toInt()

}
