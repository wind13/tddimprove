package io.github.wind13.tddimprove

class Schema() {
    private var config: String = ""

    fun setConfig(config: String) {
        this.config = config
    }

    fun getConfig(): String {
        return this.config
    }

    private lateinit var specs: List<String>

    fun size(): Int {
        this.specs = this.config.split(",")
        return specs.size
    }

    fun getFirst(): String {
        return specs.get(0)
    }

}
