package io.github.wind13.tddimprove.marsrover

class Rover {
    fun setState(state: String) {
        this.state = state
        val ss = state.split("|")
        val xy = ss.get(0).split(",")
        this.x = xy.get(0).trim().toInt()
        this.y = xy.get(1).trim().toInt()
        this.direction = Direction.getValue(ss.get(1).last())
    }

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

    constructor(state: String) {
        this.setState(state)
    }

}
