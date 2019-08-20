package io.github.wind13.tddimprove.args03

import org.testng.annotations.Test
import kotlin.test.assertEquals

object ParserTest {

    @Test
    fun test_create_parser(): Unit {
        var parser: Parser = Parser("bool")
        assertEquals("bool", parser.type)
        assertEquals(true, parser.parse("true"))
        assertEquals(false, parser.parse("false"))
        assertEquals(false, parser.parse("abc"))
        assertEquals(false, parser.parse(""))
        parser = Parser("int")
        assertEquals(8080, parser.parse("8080"))
    }
}