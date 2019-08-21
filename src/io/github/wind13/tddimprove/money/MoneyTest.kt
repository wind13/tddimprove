package io.github.wind13.tddimprove.money

import org.testng.Assert.assertEquals
import org.testng.Assert.assertNotEquals
import org.testng.annotations.Test

object MoneyTest {

    @Test
    fun test_dollar_multiplication(): Unit {
        val five = Money.dollar(5)
        assertEquals(5, five.amount)
        assertEquals(Money.dollar(5), Money.dollar(5))
        assertNotEquals(Money.dollar(5), Money.dollar(6))
        val product = five.times(2)
        assertEquals(Money.dollar(10), product)
        val fifteen = five.times(3)
        assertEquals(Money.dollar(15), fifteen)
    }

    @Test
    fun test_franc_multiplication(): Unit {
        val five = Money.franc(5)
        assertEquals(5, five.amount)
        assertEquals(Money.franc(5), Money.franc(5))
        assertNotEquals(Money.franc(6), Money.franc(5))
        val product = five.times(2)
        assertEquals(Money.franc(10), product)
        val fifteen = five.times(3)
        assertEquals(Money.franc(15), fifteen)
    }

    @Test
    fun test_money_multiplication(): Unit {
        val moneyFranc = Money(5, "CHF")
        val franc = Money.franc(5)
        assertEquals("CHF", franc.currency())
        assertEquals(moneyFranc, franc)
        val dollar = Money.dollar(5)
        assertEquals("USD", dollar.currency())
        assertEquals(franc, dollar)
//        assertEquals(franc, dollar)
    }
}