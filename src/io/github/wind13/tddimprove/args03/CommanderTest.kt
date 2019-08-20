package io.github.wind13.tddimprove.args03

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

object CommanderTest {

    @Test
    fun test_normal_commander(): Unit {
        val input = "l:bool:true|p:int:8050|d:str:/usr/logs"
        val schema: Schema = Schema(input)
        val commander:Commander = schema.parse("java -jar server.jar -l -p 8010 -d /usr/local")
        assert(commander.toString().contains("Commander"))
        assertEquals(5, commander.comlines.size)
        assertEquals(4, commander.params.size)
        assertEquals("java", commander.command)
        assertEquals(8050, commander.default("p"))
        assertEquals("server.jar", commander.param("jar"))
        assertEquals(true, commander.param("l"))
        assertEquals(8010, commander.param("p"))
        assertEquals("/usr/local", commander.param("d"))
    }

    @Test
    fun test_array_commander(): Unit {
        val input = "t:str[]:a,b,c"
        val schema: Schema = Schema(input)
        val commander:Commander = schema.parse("java -jar capture.jar -url www.baidu.com -t jpg,png,svg -d /usr/images")
        assert(commander.toString().contains("Commander"))
        assertEquals(5, commander.comlines.size)
        assertEquals(4, commander.params.size)
        assertEquals("java", commander.command)
        assertEquals("www.baidu.com", commander.param("url"))
        assertEquals("capture.jar", commander.param("jar"))
        assertEquals(listOf("jpg", "png", "svg"), commander.param("t"))
//        assertEquals(8010, commander.param("p"))
        assertEquals("/usr/images", commander.param("d"))
    }
}