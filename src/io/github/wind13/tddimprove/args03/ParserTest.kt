package io.github.wind13.tddimprove.args03

import org.testng.annotations.Test
import kotlin.test.assertEquals

object ParserTest {

    @Test
    fun test_create_parser(): Unit {
//        var Parser: Parser = Parser("bool")
//        assertEquals("bool", parser.type)
        assertEquals(true, Parser.parse("bool", "true  "))
        assertEquals(false, Parser.parse("bool", "false "))
        assertEquals(false, Parser.parse("bool", " abc"))
        assertEquals(false, Parser.parse("bool", ""))
        assertEquals(8080, Parser.parse("int", "8080"))
//        Parser = Parser("int[]")
        assertEquals(listOf(80, 90), Parser.parse("int[]", "80, 90"))
//        Parser = Parser("bool[]")
        assertEquals(listOf(false, true), Parser.parse("bool[]", "false, true"))
//        Parser = Parser("str")
        assertEquals("abc", Parser.parse("str", "abc"))
//        Parser = Parser("str[]")
        assertEquals(listOf("abc", "def"), Parser.parse("str[]", "abc, def"))
    }
}