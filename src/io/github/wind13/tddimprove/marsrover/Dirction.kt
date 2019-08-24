package io.github.wind13.tddimprove.marsrover

enum class Dirction {
    NORTH, SOUTH, WEST, EAST;

    fun short(): Char {
        return this.toString().first()
    }

    companion object {
        fun getValue(short: Char): Dirction {
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
