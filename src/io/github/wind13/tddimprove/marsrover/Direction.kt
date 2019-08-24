package io.github.wind13.tddimprove.marsrover

enum class Direction {
    NORTH, SOUTH, WEST, EAST;

    fun short(): Char {
        return this.toString().first()
    }

    fun left(): Direction {
        return when(this) {
            EAST -> NORTH
            NORTH -> WEST
            WEST -> SOUTH
            SOUTH -> EAST
        }
    }

    fun right(): Direction {
        return when(this) {
            NORTH -> EAST
            WEST -> NORTH
            SOUTH -> WEST
            EAST -> SOUTH
        }
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
