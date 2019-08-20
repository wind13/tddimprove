package io.github.wind13.tddimprove.args03

class Parser(val type: String) {
    fun parse(v: String): Any {
        if(type == "int") {
            return v.toInt()
        }
        return v.toBoolean()
    }

}
