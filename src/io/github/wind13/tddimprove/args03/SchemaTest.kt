package io.github.wind13.tddimprove.args03

import org.testng.annotations.Test
import kotlin.test.assertEquals

object SchemaTest {

    @Test
    fun test_create_schema(): Unit {
        val input = "l:bool:true|p:int:8050|d:str:/usr/logs"
        val schema: Schema = Schema(input)
        assertEquals(input, schema.input)
        assertEquals(3, schema.specs.size)
        assertEquals("int", schema.type("p"))
        assertEquals(8050, schema.default("p"))
        assertEquals(true, schema.default("l"))
        assertEquals("", schema.default("s"))

//        schema.parse("-l -p 8010 -d /usr/local")
    }
}