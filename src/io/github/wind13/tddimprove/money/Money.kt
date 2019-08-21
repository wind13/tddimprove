package io.github.wind13.tddimprove.money

open class Money(val amount: Int, val currency: String) {
    fun currency(): String {
        return currency
    }

    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount, "USD")
        }

        fun franc(amount: Int): Franc {
            return Franc(amount, "CHF")
        }
    }

    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            !is Money -> false
            else -> this === other ||
                    (amount == other.amount && currency == other.currency)
        }
    }

    override fun hashCode(): Int {
        var result = 17
        result = result * 31 + amount.hashCode()
        return result
    }
}
