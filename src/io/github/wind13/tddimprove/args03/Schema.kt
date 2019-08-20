package io.github.wind13.tddimprove.args03

class Schema(val input: String) {
    fun type(label: String): String {
        return specs.find { it.label == label }?.type ?: ""
    }

    fun default(input: String): Int {
        return 8050
    }

    val specs: List<Spec> = input.split("|").map { Spec(it) }
}
