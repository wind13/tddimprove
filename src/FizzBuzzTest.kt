import org.testng.annotations.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    @Test
    fun test_return_normal() {
        assertEquals("1", Game.of(1))
        assertEquals("2", Game.of(2))
        assertEquals("fizz", Game.of(3))
        assertEquals("buzz", Game.of(5))
        assertEquals("fizzbuzz", Game.of(15))
        assertEquals("fizz", Game.of(13))
        assertEquals("fizzbuzz", Game.of(51))
        assertEquals("fizzbuzz", Game.of(53))
    }

    object Game {
        fun div(d: Int, n: Int): Boolean {
            return n % d == 0 || n.toString().contains(d.toString());
        }
        fun of(n: Int): String {
            if (div(3, n) && div(5, n)) {
                return "fizzbuzz"
            }
            if (div(3, n)) {
                return "fizz"
            }
            if (div(5, n)) {
                return "buzz"
            }
            return n.toString()
        }

        @JvmStatic
        fun main(args: Array<String>) {
            print("args: " + args)
        }
    }
}