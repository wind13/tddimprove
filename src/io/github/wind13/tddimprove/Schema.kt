package io.github.wind13.tddimprove

class Schema() {
    private var config: String = ""

    fun setConfig(config: String) {
        this.config = config
    }

    fun getConfig(): String {
        return this.config
    }

}
