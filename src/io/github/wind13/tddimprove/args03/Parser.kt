package io.github.wind13.tddimprove.args03

import java.lang.Integer.parseInt

class Parser(val type: String) {
    fun parse(v: String): Any {
        if(type == "int") {
            return parseInt(v)
        }
        return v == "true"
    }

}
