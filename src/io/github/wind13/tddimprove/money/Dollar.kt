package io.github.wind13.tddimprove.money

class Dollar(amount: Int) : Money(amount) {
    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }
}
