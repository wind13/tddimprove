package io.github.wind13.tddimprove.marsrover

class Rover(state: String) {
    val ss = state.split("|")
    val xy = ss.get(0).split(",")
    val x:Int = xy.get(0).trim().toInt()
    val y:Int = xy.get(1).trim().toInt()
    val dirction: Dirction = Dirction.getValue(ss.get(1).last())
}
