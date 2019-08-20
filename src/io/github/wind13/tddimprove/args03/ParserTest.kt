package io.github.wind13.tddimprove.args03

import org.testng.annotations.Test
import kotlin.test.assertEquals

object ParserTest {

    @Test
    fun test_create_parser(): Unit {
        assertEquals("bool", Parser("bool").type)
    }
}