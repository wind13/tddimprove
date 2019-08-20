package io.github.wind13.tddimprove.args03

import org.testng.annotations.Test
import kotlin.test.assertEquals

object SchemaTest {

    @Test
    fun test_create_schema(): Unit {
        val input = "l:bool:true|p:int:8050|d:str:/usr/logs"
        val schema:Schema = Schema(input)
        assertEquals(input, schema.input)
    }
}