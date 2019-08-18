package io.github.wind13.tddimprove

class Schema(config: String) {

    val specs: List<Spec> = config.split(",").map {
        val ss = it.split(":")
        Spec(ss.get(0).trim(), ss.get(1).trim())
    }

    fun size(): Int {
        return specs.size
    }

    fun nth(n: Int): Spec {
        return specs.get(n)
    }

    fun value(label: String): String? {
        return specs.find {
            it.label == label
        }?.type ?: ""
    }

    fun parse(commandLine: String): Command {
        return Command("")
    }

}
