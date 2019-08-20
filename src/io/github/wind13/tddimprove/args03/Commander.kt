package io.github.wind13.tddimprove.args03

class Commander(val schema: Schema, line: String) {
    fun param(label: String): Int {
        val value =  params.find { it.label == label }?.value?:""
        return 8010
    }

    val comlines = line.split("-")

    val command: String = comlines.get(0).trim()
    val params: List<Param> = comlines.map { Param(it.trim()) }
}
