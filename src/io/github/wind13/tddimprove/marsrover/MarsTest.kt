package io.github.wind13.tddimprove.marsrover

import org.testng.annotations.Test
import kotlin.test.assertEquals

object MarsTest {
    @Test
    fun test_normal_fun(): Unit {
        assertEquals(11, add(3, 8))
    }

    @Test
    fun test_rover_created(): Unit {
        val rover:Rover = Rover("23,50,S")
        assertEquals(23, rover.x)
    }
}