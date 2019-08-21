package io.github.wind13.tddimprove.money

class Franc(override var amount: Int) : Money() {
    override fun currency(): String {
        return "CHF"
    }

    override fun times(multiplier: Int): Money {
        return Franc(amount * multiplier)
    }
}

