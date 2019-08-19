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
    fun test_command_parse_output(): Unit {
        val commandLine: String = "java -jar server.jar -l -p 8080 -d /usr/logs"
        val schema: Schema = Schema("l:bool, p:int")
        val command: Command = schema.parse(commandLine)
        assertEquals(schema, command.schema)
        assertEquals(5, command.params.size)
        assertEquals("java", command.getCommand())
        assertEquals("8080", command.getParam("p"))
        assertEquals("server.jar", command.getParam("jar"))
        assertEquals("/usr/logs", command.getParam("d"))

        assertEquals("str", schema.getType("d"))
        assertEquals("str", schema.getType("jar"))
        assertEquals("int", schema.getType("p"))

        assertEquals(true, command.getValue("l"))
        assertEquals(8080, command.getValue("p"))
        assertEquals("server.jar", command.getValue("jar"))
        assertEquals("/usr/logs", command.getValue("d"))
    }
}