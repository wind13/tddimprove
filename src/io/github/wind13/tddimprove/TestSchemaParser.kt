package io.github.wind13.tddimprove

import org.testng.annotations.Test

object TestSchemaParser {
    @Test
    fun test_schema_parser_input(): Unit {
        var schema: Schema = SchemaParser.parse("l:bool, p:int, d:str")
    }
}