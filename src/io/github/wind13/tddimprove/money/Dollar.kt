package io.github.wind13.tddimprove.money

class Dollar(override val amount: Int, override val currency: String) : Money(amount, currency) {
    override fun times(multiplier: Int): Money {
        return dollar(amount * multiplier)
    }
}
