package io.github.wind13.tddimprove

import org.testng.annotations.Test
import kotlin.test.assertEquals

object TestSchemaParser {
    @Test
    fun test_schema_parser_input(): Unit {
        val config = "l:bool, p:int, d:str"
        val schema: Schema = Schema(config)
        assertEquals(3, schema.size())
        assertEquals("io.github.wind13.tddimprove.Spec", schema.nth(0).javaClass.name)
        assertEquals("l", schema.nth(0).label)
        assertEquals("bool", schema.nth(0).type)
        assertEquals("p", schema.nth(1).label)
        assertEquals("int", schema.nth(1).type)

        val spec:Spec = Spec("a", "b")
        assertEquals("a", spec.label)
        assertEquals("b", spec.type)
    }
}