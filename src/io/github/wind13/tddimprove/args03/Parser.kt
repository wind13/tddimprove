package io.github.wind13.tddimprove.args03

class Parser(val type: String) {
    fun parse(strValue: String): Any {
        val trimedValue = strValue.trim()
        return when (type) {
            "int" -> trimedValue.toInt()
            "bool" -> trimedValue.toBoolean()
            else -> trimedValue
        }
    }

}
