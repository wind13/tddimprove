package io.github.wind13.tddimprove.args03

class Param(val input: String) {
    private val regex = Regex("\\s+")
    private val split = input.trim().split(regex)
    private fun trimSplit(n: Int): String {
        return if (n >= 1 && split.size <= 1) "" else split[n].trim()
    }

    val label: String = trimSplit(0)
    val value: String = trimSplit(1)
}