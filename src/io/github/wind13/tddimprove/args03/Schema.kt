package io.github.wind13.tddimprove.args03

class Schema(val input: String) {
    val params: List<Spec> = input.split("|").map { Spec(it) }
}
