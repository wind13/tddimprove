package io.github.wind13.tddimprove.args03

class Commander(val line: String) {

    val comlines = line.split("-")

    val command: String = comlines.get(0).trim()
    val params: List<Param> = comlines.map { Param(it.trim()) }
}
