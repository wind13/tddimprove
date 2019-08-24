package io.github.wind13.tddimprove.marsrover

class Rover {
    fun land(state: String) {
        this.state = state
        val ss = state.split("|")
        val xy = ss.get(0).split(",")
        this.x = xy.get(0).trim().toInt()
        this.y = xy.get(1).trim().toInt()
        this.direction = Direction.getValue(ss.get(1).last())
    }

    fun forward(step: Int) {
        when(this.direction) {
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

    var speed: Int = 1

    lateinit var state: String
        private set
    var x: Int = 0
        private set
    var y: Int = 0
        private set
    var direction: Direction = Direction.SOUTH
        private set

    constructor(x:Int, y:Int, direction: Direction) {
        this.x = x
        this.y = y
        this.direction = direction
    }

    constructor(speed: Int) {
        this.speed = speed
    }

}
