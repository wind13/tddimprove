package io.github.wind13.tddimprove.args03

class Spec(val input:String) {
    val label: String = input.split(":")[0].trim()
    val type: String = input.split(":")[1].trim()
    val default: String = input.split(":")[2].trim()
}