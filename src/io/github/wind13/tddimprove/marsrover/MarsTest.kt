package io.github.wind13.tddimprove.marsrover

import org.testng.annotations.Test
import kotlin.test.assertEquals

object MarsTest {

    @Test
    fun test_direction(): Unit {
        assertEquals('S', Direction.SOUTH.short())
        assertEquals(Direction.EAST, Direction.getValue('E'))
        assertEquals(Direction.NORTH, Direction.EAST.left())
        assertEquals(Direction.EAST, Direction.SOUTH.left())
        assertEquals(Direction.WEST, Direction.NORTH.left())
        assertEquals(Direction.SOUTH, Direction.WEST.left())
        assertEquals(Direction.EAST, Direction.NORTH.right())
        assertEquals(Direction.SOUTH, Direction.EAST.right())
        assertEquals(Direction.NORTH, Direction.WEST.right())
        assertEquals(Direction.WEST, Direction.SOUTH.right())
        val dr = Direction.random()
        println(dr.name)
        assert(dr.javaClass.name.contains("Direction"))
    }

    @Test
    fun test_rover_created(): Unit {
        val speed = 2
        val size = 100
        val mars = Mars(size, size)
        val rover = Rover(speed)
        val state = "23,50|S"
//        val rover = Rover(state)
        rover.land(mars, state)
        assertEquals(state, rover.state)
        assertEquals(23, rover.x)
        assertEquals(50, rover.y)
        assertEquals(Direction.SOUTH, rover.direction)
        rover.land(mars, "39,49|N")
        assertEquals(39, rover.x)
        assertEquals(49, rover.y)
        assertEquals(Direction.NORTH, rover.direction)

        rover.forward(20)
        assertEquals(69, rover.y)
        rover.left()
        assertEquals(Direction.WEST, rover.direction)
        rover.backward(20)
        assertEquals(59, rover.x)
        rover.right()
        assertEquals(Direction.NORTH, rover.direction)
    }

    @Test
    fun test_mars_created(): Unit {
        val size = 10
        val mars = Mars(size, size)
        assertEquals(size, mars.width)
        assertEquals(size, mars.height)
        val s = """
        OOOOOOOOOO
        OOOOOOOOOO
        OOOOOOOOOO
        OOOOOOOOOO
        OOOOOOOOOO
        OOOOOOOOOO
        OOOOOOOOOO
        OOOOOOOOOO
        OOOOOOOOOO
        OOOOOOOOOO
        """.trimIndent()
        assertEquals(s, mars.display())
    }

    @Test
    fun test_base_created(): Unit {
        val size = 100
        val mars = Mars(size, size)
        val speed = 2
        val roverMock = Rover(speed)
        val base = Base(mars, roverMock)
        assertEquals(mars, base.mars)
        assertEquals(roverMock, base.rover)
    }

    @Test
    fun test_rover_research(): Unit {
        val size = 100
        val mars = Mars(size, size)
        val state = "23,50|S"
        val speed = 2
        val rover = Rover(speed)
        rover.land(mars, state)
        assertEquals(state, rover.state)
        assertEquals(23, rover.x)
        assertEquals(Direction.SOUTH, rover.direction)
        rover.forward(30)
        val stateLand = rover.send()
        assertEquals("23,20|S", stateLand)

        val roverMock = Rover(speed)
        val base = Base(mars, roverMock)
        base.receive(stateLand)
    }
}