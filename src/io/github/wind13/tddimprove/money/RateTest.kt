package io.github.wind13.tddimprove.money

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

object RateTest {

    @Test
    fun test_rate(): Unit {
        val rate = Rate("USD", "CHF", 2)
        assertEquals(2, rate.rate)
    }
}