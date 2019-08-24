package io.github.wind13.tddimprove.marsrover

class Mars(val width:Int, val height:Int) {
    fun main(args: Array<String>) {
        print("Mars main")
    }
    val N = "O"
    val Y = "*"

    fun display(): String {
        return (1..height).map {
            return (1..width).map { return N }.joinToString { "" }
        }.joinToString { "\n" }
    }
}
