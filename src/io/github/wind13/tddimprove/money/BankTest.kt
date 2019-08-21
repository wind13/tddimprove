package io.github.wind13.tddimprove.money

import org.testng.annotations.Test

object BankTest {

    @Test
    fun test_bank_rate(): Unit {
        val bank = Bank()
        bank.addRate("USD", "CHF", 2)
        val rate = bank.rate("USD", "CHF")
        assert(2 == rate)
    }
}