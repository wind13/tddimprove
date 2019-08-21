package io.github.wind13.tddimprove.money

import org.testng.annotations.Test
import kotlin.test.assertEquals

object MoneyTest {

    @Test
    fun test_multiplication(): Unit {
        val five = Dollar(5)
        assertEquals(5, five.amount)
        assertEquals(Dollar(5), Dollar(5))
        val product = five.times(2)
        assertEquals(Dollar(10), product)
        val fifteen = five.times(3)
        assertEquals(Dollar(15), fifteen)
    }
}