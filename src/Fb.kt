object Fb {
    fun isDiv(d:Int, n:Int): Boolean {
        return n % d == 0 || n.toString().contains(d.toString())
    }

    fun of(n: Int): String {
        if (isDiv(3, n) && isDiv(5, n)) {
            return "fizzbuzz"
        }
        if (isDiv(5, n)) {
            return "buzz"
        }
        if (isDiv(3, n)) {
            return "fizz"
        }
        return n.toString()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        print("args: " + args.toString())
    }
}
