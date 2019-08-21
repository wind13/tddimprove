package io.github.wind13.tddimprove.money

class Dollar(override var amount: Int) : Money() {
    override fun currency(): String {
        return "USD"
    }

    override fun times(multiplier: Int): Money {
        return Dollar(amount * multiplier)
    }
}
