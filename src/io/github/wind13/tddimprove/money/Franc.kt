package io.github.wind13.tddimprove.money

class Franc(amount: Int, currency: String) : Money(amount, currency) {
    override fun times(multiplier: Int): Money {
        return franc(amount * multiplier)
    }
}

