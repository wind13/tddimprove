package io.github.wind13.tddimprove

object SchemaParser {
    fun parse(config: String): Schema {
        val schema = Schema()
        schema.setConfig(config)
        return schema
    }

}
