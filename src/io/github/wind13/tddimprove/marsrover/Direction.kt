package io.github.wind13.tddimprove.marsrover

enum class Direction {
    NORTH, SOUTH, WEST, EAST;

    fun short(): Char {
        return this.toString().first()
    }

    fun left(): Direction {
        return NORTH
    }

    companion object {
        fun getValue(short: Char): Direction {
            return when(short) {
                'N' -> NORTH
                'S' -> SOUTH
                'W' -> WEST
                'E' -> EAST
                else -> NORTH
            }
        }
    }

}
