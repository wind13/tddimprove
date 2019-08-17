package io.github.wind13.tddimprove

class Schema(config:String) {

    val specs: List<Spec> = config.split(",").map {
        Spec(it, "good")
    }

    fun size(): Int {
        return specs.size
    }

    fun getFirst(): Spec {
        return specs.get(0)
    }

}
