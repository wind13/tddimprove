package io.github.wind13.tddimprove.money

import org.testng.annotations.Test
import kotlin.test.assertEquals

object MoneyTest {

    @Test
    fun test_multiplication(): Unit {
        val five:Dollar = Dollar(5)
        assertEquals(5, five.amount)
        assertEquals(10, five.times(2).amount)
        assertEquals(15, five.times(3).amount)
    }
}