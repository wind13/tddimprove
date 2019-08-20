package io.github.wind13.tddimprove.args03

import org.testng.annotations.Test
import kotlin.test.assertEquals

object SpecTest {

    @Test
    fun test_create_spec(): Unit {
        val input = "l:bool:true"
        val spec: Spec = Spec(input)
        assertEquals(input, spec.input)
        assertEquals("l", spec.label)
        assertEquals("bool", spec.type)
        assertEquals(true, spec.default)
    }

    fun test_int_spec(): Unit {
        val input = "p:int:8020"
        val spec: Spec = Spec(input)
        assertEquals(input, spec.input)
        assertEquals("p", spec.label)
        assertEquals("int", spec.type)
        assertEquals(8020, spec.default)
    }

    fun test_ints_spec(): Unit {
        val input = "p:int[]:80,20"
        val spec: Spec = Spec(input)
        assertEquals(input, spec.input)
        assertEquals("p", spec.label)
        assertEquals("int[]", spec.type)
        assertEquals(listOf(80, 20), spec.default)
    }
    fun test_strs_spec(): Unit {
        val input = "d:str[]:test,good"
        val spec: Spec = Spec(input)
        assertEquals(input, spec.input)
        assertEquals("d", spec.label)
        assertEquals("str[]", spec.type)
        assertEquals(listOf("test", "good"), spec.default)
    }
}