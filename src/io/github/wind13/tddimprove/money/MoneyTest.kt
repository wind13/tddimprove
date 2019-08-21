package io.github.wind13.tddimprove.money

import org.testng.annotations.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

object MoneyTest {

    @Test
    fun test_dollar_multiplication(): Unit {
        val five = Dollar(5)
        assertEquals(5, five.amount)
        assertEquals(Dollar(5), Dollar(5))
        assertNotEquals(Dollar(5), Dollar(6))
        val product = five.times(2)
        assertEquals(Dollar(10), product)
        val fifteen = five.times(3)
        assertEquals(Dollar(15), fifteen)
    }

    @Test
    fun test_franc_multiplication(): Unit {
        val five = Franc(5)
        assertEquals(5, five.amount)
        assertEquals(Franc(5), Franc(5))
        assertNotEquals(Franc(6), Franc(5))
        val product = five.times(2)
        assertEquals(Franc(10), product)
        val fifteen = five.times(3)
        assertEquals(Franc(15), fifteen)
    }
}