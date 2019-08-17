package io.github.wind13.tddimprove

class Schema(config:String) {

    val specs: List<Spec> = config.split(",").map {
        val ss = it.split(":")
        Spec(ss.get(0), ss.get(1))
    }

    fun size(): Int {
        return specs.size
    }

    fun nth(n:Int): Spec {
        return specs.get(n)
    }

}
