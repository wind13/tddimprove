package io.github.wind13.tddimprove

import org.testng.annotations.Test
import kotlin.test.assertEquals

object CommandParseTest {

    @Test
    fun test_command_parser_input(): Unit {
        val commandLine: String = "java -jar server.jar -l -p 8080 -d /usr/logs"
        val command:Command = Command(commandLine)
        assertEquals(commandLine, command.commandLine)
        assertEquals(9, 3*3)
    }

}