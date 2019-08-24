package io.github.wind13.tddimprove.marsrover

import org.testng.annotations.Test
import kotlin.random.Random
import kotlin.test.assertEquals

object MarsTest {

    @Test
    fun test_direction(): Unit {
        assertEquals('S', Direction.SOUTH.short())
        assertEquals(Direction.EAST, Direction.getValue('E'))
    }

    @Test
    fun test_rover_created(): Unit {
        val state = "23,50|S"
        val rover = Rover(state)
        assertEquals(state, rover.state)
        assertEquals(23, rover.x)
        assertEquals(50, rover.y)
        assertEquals(Direction.SOUTH, rover.direction)
        rover.setState("39,49|N")
        assertEquals(39, rover.x)
        assertEquals(49, rover.y)
        assertEquals(Direction.NORTH, rover.direction)

        rover.forward(20)
    }

    @Test
    fun test_mars_created(): Unit {
        val size = 1000
        val mars = Mars(size, size)
        assertEquals(size, mars.width)
        assertEquals(size, mars.height)
        val r = Random.nextInt(size)
        println(r)
        val o = Random.nextInt(size)
        println(o)
        assert(o < size)
    }
}