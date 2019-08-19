package io.github.wind13.tddimprove

import java.lang.Integer.parseInt

class Command(val schema: Schema, val commandLine: String) {
    val params = commandLine.split("-").map {
        Param(it.trim())
    }


    fun getValue(label: String): Any {
        when (schema.getType(label)) {
            "bool" -> return getParam(label) == ""
            "int" -> return parseInt(getParam(label))
            else -> return getParam(label)
        }
    }

    fun getCommand(): String {
        return params.get(0).input
    }

    fun getParam(label: String): String {
        return params.find { it.getLabel() == label }?.getValue()?:""
    }
}
