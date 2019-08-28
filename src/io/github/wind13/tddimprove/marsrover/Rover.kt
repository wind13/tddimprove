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
        this.updateState()
    }

    fun left() {
        this.direction = this.direction.left()
        this.updateState()
    }

    fun right() {
        this.direction = this.direction.right()
        this.updateState()
    }

    fun doNothing() {
    }

    fun backward(step: Int) {
        this.forward(-step)
    }

    fun land(mars: Mars): String {
        val x = Random.nextInt(mars.width)
        val y = Random.nextInt(mars.height)
        this.land(x.toString() + "," + y.toString() + "|" + Direction.random())
        return this.state;
    }

    // This is for test function mock random land position.
    fun land(mars: Mars, state: String): String {
        this.land(state)
        return this.state;
    }

    fun send(): String {
        // send event to base
        println("Send \"" + this.state + "\" event to base...")
        return this.state
    }

    private fun updateState() {
        this.state = x.toString() + "," + y.toString() + "|" + direction.short()
    }

    fun receive(command: String) {
        // f9lf1lf9rf1r
//        var fw = false
        command.chars().forEach {
//            when{
//                it == 'l'.toInt() -> this.left()
//                it == 'r'.toInt() -> this.right()
//                it == 'f'.toInt() -> fw = true
//                it <= '9'.toInt() && it >= '0'.toInt() -> this.forward(it.toChar().toInt())
//                else -> this.doNothing()
//            }
            println(it)
        }
        println('0'.toInt())
        println('9'.toInt())
        println(57.toChar().toString().toInt())
        println(57.toChar().toInt())
        this.forward(9)
        this.left()
        this.forward(1)
        this.left()
        this.forward(9)
        this.right()
        this.forward(1)
        this.right()
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
