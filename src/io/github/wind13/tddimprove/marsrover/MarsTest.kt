package io.github.wind13.tddimprove.marsrover

import org.testng.annotations.Test
import kotlin.test.assertEquals

object MarsTest {
    @Test
    fun test_normal_fun(): Unit {
        assertEquals(11, add(3, 8))
    }
}