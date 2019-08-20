package io.github.wind13.tddimprove.args03

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

object CommanderTest {

    @Test
    fun test_create_commander(): Unit {
        val input = "l:bool:true|p:int:8050|d:str:/usr/logs"
        val schema: Schema = Schema(input)
        val commander:Commander = schema.parse("java -jar server.jar -l -p 8010 -d /usr/local")
        assert(commander.toString().contains("Commander"))
        assertEquals(5, commander.params.size)
        assertEquals("java", commander.command)
        assertEquals(8010, commander.param("p"))
    }
}