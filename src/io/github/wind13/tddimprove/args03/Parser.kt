package io.github.wind13.tddimprove.args03

class Parser(val type: String) {
    fun parse(v: String): Any {
        when (type) {
            "int" -> return v.trim().toInt()
            "bool" -> return v.trim().toBoolean()
            else -> return v.trim()
        }
    }

}
