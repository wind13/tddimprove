package io.github.wind13.tddimprove.marsrover

enum class Dirction {
    NORTH, SOUTH, WEST, EAST;

    fun short(): String {
        return this.toString().first().toString()
    }

    companion object {
        fun getValue(short: Char): Dirction {
            return EAST
        }
    }

}
