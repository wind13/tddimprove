package io.github.wind13.tddimprove.marsrover

class Mars(val width:Int, val height:Int) {
    fun main(args: Array<String>) {
        print("Mars main")
    }
    val N = "O"
    val Y = "*"

    fun display(): String {
        var s = ""
        for (i in 1..width) {
            s += "mars \n mars"
        }
        return s
    }
}
