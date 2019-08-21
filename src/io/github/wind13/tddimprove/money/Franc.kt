package io.github.wind13.tddimprove.money

class Franc(override var amount: Int) : Money() {
    override var currency = "CHF"
    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}

