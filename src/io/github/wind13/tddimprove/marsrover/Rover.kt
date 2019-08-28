package io.github.wind13.tddimprove.marsrover

import kotlin.random.Random

class Rover(val speed: Int) {

    lateinit var mars: Mars
    // Just forward, no backward, and max <= 9 step
    public final val commandUnit = "9l1l9r1r"

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
        val ox = this.x
        val oy = this.y
        var i = 0
        var m = step
        if (step < 0) {
            this.direction = this.direction.right().right()
            m = -step
        }
        while (i < m) {
            println("y1:" + this.y)
            when (this.direction) {
                Direction.SOUTH -> this.y--
                Direction.NORTH -> this.y++
                Direction.WEST -> this.x--
                Direction.EAST -> this.x++
            }
            if (this.y >= this.mars.height) {
                this.y = this.y - this.mars.height
            }
            if (this.y < 0) {
                this.y = this.mars.height + this.y
            }
            if (this.x < 0) {
                this.x = this.mars.width + this.x
            }
            if (this.x >= this.mars.width) {
                this.x = this.x - this.mars.width
            }
            println("y2:" + this.y)
            this.mars.research(this.x, this.y)
            i++
        }
        if (step < 0) {
            this.direction = this.direction.right().right()
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
        this.mars = mars
        val x = Random.nextInt(mars.width)
        val y = Random.nextInt(mars.height)
        return this.land(mars, x.toString() + "," + y.toString() + "|" + Direction.random())
    }

    // This is for test function mock random land position.
    fun land(mars: Mars, state: String): String {
        this.mars = mars
        this.land(state)
        this.mars.research(this.x, this.y)
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
        var fw = false
        command.chars().forEach {
            when {
                it == 'l'.toInt() -> this.left()
                it == 'r'.toInt() -> this.right()
                it <= '9'.toInt() && it > '0'.toInt() -> this.forward(it.toChar().toString().toInt())
                else -> this.doNothing()
            }
        }
    }

    fun nCommands(n: Int): String {
        return (1..n).map { this.commandUnit }.joinToString("")
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
