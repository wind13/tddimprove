package io.github.wind13.tddimprove.money

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

object BankTest {

    @Test
    fun test_bank_rate(): Unit {
        val bank = Bank()
        bank.addRate("USD", "CHF", 2)
        val rate = bank.rate("USD", "CHF")
        assert(2 == rate)
        val fiveDollars = Money.dollar(5)
        val tenFrancs = Money.franc(10)
        val result:Money = bank.reduce(fiveDollars.plus(tenFrancs), "USD")
        assertEquals(15, result.amount)
    }
}