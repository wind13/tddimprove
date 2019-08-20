package io.github.wind13.tddimprove.fizzbuzz

import org.testng.annotations.Test
import kotlin.test.assertEquals

fun isRelated(d: Int, n: Int): Boolean {
    return n % d == 0 || n.toString().contains(d.toString());
}

object FizzBuzz {
    fun of(n: Int): String {
        if (isRelated(3, n) && isRelated(5, n)) {
            return "fizzbuzz"
        }
        if (isRelated(5, n)) {
            return "buzz"
        }
        if (isRelated(3, n)) {
            return "fizz"
        }
        return String.format("%s", n)
    }
}

class MyTest {

    @Test
    fun proof_of_concept() {
        assertEquals(4 , 2 + 2)
    }

    @Test
    fun should_return_number_noraml() {
        assertEquals("1", FizzBuzz.of(1))
        assertEquals("2", FizzBuzz.of(2))
    }

    @Test
    fun should_return_fizz_3() {
        assertEquals("fizz", FizzBuzz.of(3))
        assertEquals("fizz", FizzBuzz.of(13))
    }

    @Test
    fun should_return_buzz_5() {
        assertEquals("buzz", FizzBuzz.of(5))
        assertEquals("buzz", FizzBuzz.of(58))
    }

    @Test
    fun should_return_fizzbuzz_3_and_5() {
        assertEquals("fizzbuzz", FizzBuzz.of(15))
        assertEquals("fizzbuzz", FizzBuzz.of(30))
        assertEquals("fizzbuzz", FizzBuzz.of(51))
        assertEquals("fizzbuzz", FizzBuzz.of(53))
    }
}

