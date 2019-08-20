package io.github.wind13.tddimprove.args03

class Spec(val input:String) {
    val ins = input.split(":")
    private fun nth(n:Int): String {
        return ins[n].trim()
    }
    val label: String = nth(0)
    val type: String = nth(1)
    val default: Any = Parser.parse(type, nth(2))
}