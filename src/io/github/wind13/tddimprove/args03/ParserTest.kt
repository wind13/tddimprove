package io.github.wind13.tddimprove.args03

import org.testng.annotations.Test
import kotlin.test.assertEquals

object ParserTest {

    @Test
    fun test_create_parser(): Unit {
        var parser: Parser = Parser("bool")
        assertEquals("bool", parser.type)
        assertEquals(true, parser.parse("true"))
        parser = Parser("int")
        assertEquals(8080, parser.parse("8080"))
    }
}