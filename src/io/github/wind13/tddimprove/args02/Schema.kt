package io.github.wind13.tddimprove.args02

class Schema(config: String) {

    private lateinit var params: List<Param>
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

    fun getType(label: String): String? {
        return specs.find {
            it.label == label
        }?.type ?: "str"
    }

    fun parse(commandLine: String): Command {
        return Command(this, commandLine)
    }

}
