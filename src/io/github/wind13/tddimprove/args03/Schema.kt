package io.github.wind13.tddimprove.args03

class Schema(val input: String) {
    private fun find(label: String) = specs.find { it.label == label }

    fun type(label: String): String {
        return find(label)?.type ?: ""
    }

    fun default(label: String): Any {
        return find(label)?.default?:""
    }

    val specs: List<Spec> = input.split("|").map { Spec(it) }
}
