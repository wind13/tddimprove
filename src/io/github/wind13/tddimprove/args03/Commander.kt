package io.github.wind13.tddimprove.args03

class Commander(val line: String) {

    val params: List<Param> = line.split("-").map { Param(it.trim()) }
}
