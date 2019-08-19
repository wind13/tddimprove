package io.github.wind13.tddimprove

class Command(val schema: Schema, val commandLine: String) {
    val params = commandLine.split("-").map {
        Param(it.trim())
    }
    fun getValue(label: String): Boolean {
        when {
            schema.getType(label) == "bool" -> return true
        }
        return true
    }

    fun getCommand(): String {
        return params.get(0).input
    }
}
