package io.github.wind13.tddimprove.marsrover

import kotlin.random.Random

class Rover(val speed: Int) {
    private fun land(x: Int, y: Int, direction: Direction) {
        this.x = x
        this.y = y
        this.direction = direction
    }

    private fun land(state: String) {
        this.state = state
        val ss = state.split("|")
        val xy = ss.get(0).split(",")
        this.land(xy.get(0).trim().toInt(), xy.get(1).trim().toInt(), Direction.getValue(ss.get(1).last()))
    }

    fun forward(step: Int) {
        when (this.direction) {
            Direction.SOUTH -> this.y -= step
            Direction.NORTH -> this.y += step
            Direction.WEST -> this.x -= step
            Direction.EAST -> this.x += step
        }
    }

    fun left() {
        this.direction = this.direction.left()
    }

    fun right() {
        this.direction = this.direction.right()
    }

    fun backward(step: Int) {
        this.forward(-step)
    }

    fun land(mars: Mars): String {
        val x = Random.nextInt(mars.width)
        val y = Random.nextInt(mars.height)
        this.land(x.toString() + "," + y.toString() + "|" + Direction.SOUTH.short())
        return this.state;
    }

    fun land(mars: Mars, state: String): String {
        this.land(state)
        return this.state;
    }

    lateinit var state: String
        private set
    var x: Int = 0
        private set
    var y: Int = 0
        private set
    var direction: Direction = Direction.SOUTH
        private set
}
