package io.github.wind13.tddimprove

import org.testng.annotations.Test
import kotlin.test.assertEquals

object CommandParseTest {

    @Test
    fun test_param_create(): Unit {
        val p1: Param = Param("l  ")
        assertEquals("l", p1.getLabel())
        assertEquals("", p1.getValue())
        val p2: Param = Param("p 8080  ")
        assertEquals("p", p2.getLabel())
        assertEquals("8080", p2.getValue())
    }

    @Test
    fun test_command_parser_input(): Unit {
        val commandLine: String = "java -jar server.jar -l -p 8080 -d /usr/logs"
        val command: Command = Command(commandLine)
        assertEquals(commandLine, command.commandLine)
    }

    @Test
    fun test_command_parse_output(): Unit {
        val commandLine: String = "java -jar server.jar -l -p 8080 -d /usr/logs"
        val schema: Schema = Schema("l:bool, p:int, d:str")
//        val command: Command = schema.parse(commandLine)
//        assertEquals(true, command.getValue("l"))
    }
}