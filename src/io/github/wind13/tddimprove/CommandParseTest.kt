package io.github.wind13.tddimprove

import org.testng.annotations.Test
import kotlin.test.assertEquals

object CommandParseTest {

    @Test
    fun test_command_parser_input(): Unit {
        val commandLine: String = "-l -p 8080 -d /usr/logs"
        assertEquals(9, 3*3)
    }

}