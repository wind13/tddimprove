package io.github.wind13.tddimprove

import org.testng.annotations.Test
import kotlin.test.assertEquals

object TestSchemaParser {
    @Test
    fun test_schema_parser_input(): Unit {
        val config = "l:bool, p:int, d:str"
        val schema: Schema = Schema(config)
        assertEquals(3, schema.size())
        assertEquals("l:bool", schema.getFirst())
    }
}