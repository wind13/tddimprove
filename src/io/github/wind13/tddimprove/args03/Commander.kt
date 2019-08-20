package io.github.wind13.tddimprove.args03

class Commander(val schema: Schema, val line: String) {
    fun param(label: String): Any {
        val value = params.find { it.label == label }?.value ?: ""
        return if (value == "") default(label) else Parser.parse(schema.type(label), value)
    }

    fun default(label: String): Any {
        return schema.default(label)
    }

    val comlines = line.split("-")

    val command: String = comlines.get(0).trim()
    val params: List<Param> = comlines.map { Param(it.trim()) }
}
