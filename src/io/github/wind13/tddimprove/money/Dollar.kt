package io.github.wind13.tddimprove.money

class Dollar(var amount: Int) {
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            !is Dollar -> false
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
