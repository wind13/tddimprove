package io.github.wind13.tddimprove.args03

class Parser(val type: String) {
    fun parse(v: String): Boolean {
        return v == "true"
    }

}
