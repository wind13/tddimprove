package io.github.wind13.tddimprove.args03

class Parser(val type: String) {
    fun parse(strValue: String): Any {
        val trimedValue = strValue.trim()
        return when (type) {
            "int" -> trimToInt(strValue)
            "bool" -> trimToBool(strValue)
            "int[]" -> trimedValue.split(",").map { trimToInt(it) }
            "bool[]" -> trimedValue.split(",").map { trimToBool(it) }
            "str[]" -> trimedValue.split(",").map { trimToStr(it) }
            else -> trimedValue
        }
    }

    private fun trimToStr(it: String) = it.trim()

    private fun trimToBool(it: String) = it.trim().toBoolean()

    private fun trimToInt(it: String) = it.trim().toInt()

}
