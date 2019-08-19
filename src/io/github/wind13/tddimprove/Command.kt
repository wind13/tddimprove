package io.github.wind13.tddimprove

class Command(val schema: Schema, val params: List<Param>) {
    fun getValue(label: String): Boolean {
        schema.getType(label)
        return true
    }

    fun getCommand(): String {
        return params.get(0).input
    }
}
