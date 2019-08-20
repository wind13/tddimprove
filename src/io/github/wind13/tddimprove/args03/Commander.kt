package io.github.wind13.tddimprove.args03

class Commander(val schema: Schema, val line: String) {
    val comlines = line.split("-")
    val command: String = comlines.first().trim()
    val params: List<Param> = comlines.subList(1, comlines.size).map { Param(it.trim()) }

    fun default(label: String): Any {
        return schema.default(label)
    }

    fun param(label: String): Any {
        val value = params.find { it.label == label }?.value ?: ""
        val parsedValue = Parser.parse(schema.type(label), value)
        return if (value == "") default(label) else parsedValue
    }
}
