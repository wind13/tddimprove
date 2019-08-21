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
        assertNotEquals(franc, dollar)
    }

    @Test
    fun test_sum_money(): Unit {
        val bank = Bank()
        bank.addRate("USD", "CHF", 2)
//        bank.addRate("CHF", "USD", 0.5)
        val fiveDollar = Money.dollar(5)
        val sum:Money = fiveDollar.plus(Money.dollar(8), bank, "USD")
        assertEquals(Money.dollar(13), sum)
        val eightFranc = Money.franc(8)
        assertEquals(Money.franc(10), fiveDollar.trans(bank, "CHF"))
        assertEquals(Money.franc(8), eightFranc.trans(bank, "CHF"))
        val merged:Money = fiveDollar.plus(eightFranc, bank, "CHF")
        assertEquals(Money.franc(18), merged)
    }
}