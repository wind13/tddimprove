package io.github.wind13.tddimprove.money

class Franc(amount: Int) : Money(amount) {
    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}

