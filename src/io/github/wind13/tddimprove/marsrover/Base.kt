package io.github.wind13.tddimprove.marsrover

class Base(val mars: Mars) {
    private val states: MutableList<String> = ArrayList()

    fun receive(newState: String) {
        states.add(newState)
    }

}
