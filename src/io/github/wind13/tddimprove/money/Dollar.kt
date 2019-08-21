package io.github.wind13.tddimprove.money

class Dollar(amount: Int, currency: String) : Money(amount, currency) {
    override fun times(multiplier: Int): Money {
        return dollar(amount * multiplier)
    }
}
