package io.github.wind13.tddimprove.marsrover

class Rover(val speed: Int) {
    fun land(x:Int, y:Int, direction: Direction) {
        this.x = x
        this.y = y
        this.direction = direction
    }

    fun land(state: String) {
        this.state = state
        val ss = state.split("|")
        val xy = ss.get(0).split(",")
        this.land(xy.get(0).trim().toInt(), xy.get(1).trim().toInt(), Direction.getValue(ss.get(1).last()))
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

    lateinit var state: String
        private set
    var x: Int = 0
        private set
    var y: Int = 0
        private set
    var direction: Direction = Direction.SOUTH
        private set
}
