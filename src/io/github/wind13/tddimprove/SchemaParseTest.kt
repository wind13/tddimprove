package io.github.wind13.tddimprove

import org.testng.annotations.Test
import kotlin.test.assertEquals

object SchemaParseTest {
    @Test
    fun test_schema_parser_input(): Unit {
        val spec: Spec = Spec("a", "b")
        assertEquals("a", spec.label)
        assertEquals("b", spec.type)

        val config = "l:bool, p:int, d:str"
        val schema: Schema = Schema(config)
        assertEquals(3, schema.size())
        assertEquals("io.github.wind13.tddimprove.Spec", schema.nth(0).javaClass.name)
        assertEquals("l", schema.nth(0).label)
        assertEquals("bool", schema.nth(0).type)
        assertEquals("p", schema.nth(1).label)
        assertEquals("int", schema.nth(1).type)
        assertEquals("d", schema.nth(2).label)
        assertEquals("str", schema.nth(2).type)

        assertEquals("bool", schema.value("l"))
        assertEquals("int", schema.value("p"))
        assertEquals("str", schema.value("d"))
        assertEquals("", schema.value("n"))
    }
}