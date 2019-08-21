package io.github.wind13.tddimprove.money

open class Money(var amount: Int) {
    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }
    }
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
