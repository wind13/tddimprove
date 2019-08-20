package io.github.wind13.tddimprove.args03

import org.testng.annotations.Test
import kotlin.test.assertEquals

object ParamTest {

    @Test
    fun test_create_param(): Unit {
        val input = "p   8010 "
        val param = Param(input)
        assertEquals(input, param.input)
        assertEquals("p", param.label)
        assertEquals("8010", param.value)
    }
}