package io.github.wind13.tddimprove.marsrover

class Base(val mars: Mars, val rover: Rover) {
    lateinit var nearestCorner: String
    private val states: MutableList<String> = ArrayList()

    fun receive(newState: String) {
        states.add(newState)
        rover.land(mars, newState)
        nearestCorner = "0,0"
    }


}
