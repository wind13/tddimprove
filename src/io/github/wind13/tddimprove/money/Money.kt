package io.github.wind13.tddimprove.money

abstract class Money {
    abstract var amount: Int
    abstract var currency: String
    fun currency(): String {
        return currency
    }

    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }

        fun franc(amount: Int): Franc {
            return Franc(amount)
        }
    }

    abstract fun times(multiplier: Int): Money

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
