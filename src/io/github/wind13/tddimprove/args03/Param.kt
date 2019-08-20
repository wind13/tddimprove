package io.github.wind13.tddimprove.args03

class Param(val input:String) {
    private val regex = Regex("\\s+")
    private fun trimSplit(n:Int) = input.trim().split(regex)[n].trim()

    val label: String = trimSplit(0)
    val value: String = trimSplit(1)
}