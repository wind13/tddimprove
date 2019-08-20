package io.github.wind13.tddimprove.args03

class Parser(val type: String) {
    fun parse(v: String): Any {
        return when (type) {
            "int" -> v.trim().toInt()
            "bool" -> v.trim().toBoolean()
            else -> v.trim()
        }
    }

}
