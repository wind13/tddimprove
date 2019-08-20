package io.github.wind13.tddimprove.args03

class Param(val input:String) {
    val label: String = input.trim().split(" ")[0]
}