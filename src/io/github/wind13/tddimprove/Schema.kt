package io.github.wind13.tddimprove

class Schema(config:String) {

    val specs: List<String> = config.split(",")

    fun size(): Int {
        return specs.size
    }

    fun getFirst(): String {
        return specs.get(0)
    }

}
