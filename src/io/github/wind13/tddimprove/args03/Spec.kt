package io.github.wind13.tddimprove.args03

class Spec(val input:String) {
    private fun nth(n:Int) = input.split(":")[n].trim()

    val label: String = nth(0)
    val type: String = nth(1)
    val default: String = nth(2)
}