package io.github.wind13.tddimprove.marsrover

class Mars(val width:Int, val height:Int) {
    fun main(args: Array<String>) {
        print("Mars main")
    }
    val N = "O"
    val Y = "*"

    fun display(): String {
        return (1..height).map {
            (1..width).map { N }.joinToString("")
        }.joinToString("\n")
    }

    fun research(x: Int, y: Int): String {
        val ys = area.split("\n").toMutableList()
        val iy = this.height - 1 - y
        var xs = ys.get(iy)
        xs = xs.replaceRange(x, x+1, Y)
        ys[iy] = xs
        this.area = ys.joinToString("\n")
        return this.area
    }

    var area = this.display()
}
