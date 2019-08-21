package io.github.wind13.tddimprove.money

class Franc(override val amount: Int, override val currency: String) : Money(amount, currency) {
    override fun times(multiplier: Int): Money {
        return franc(amount * multiplier)
    }
}

