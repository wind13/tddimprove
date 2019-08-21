package io.github.wind13.tddimprove.money

class Money(var amount: Int) {
    fun times(multiplier: Int): Money {
        return Money(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            !is Money -> false
            else -> this === other ||
                    amount == other.amount
        }
    }

    override fun hashCode(): Int {
        var result = 17
        result = result * 31 + amount.hashCode()
        return result
    }
}
