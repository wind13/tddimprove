package io.github.wind13.tddimprove.money

class Franc(var amount: Int) {
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

    override fun equals(other: Any?): Boolean {
        return when (other) {
            !is Franc -> false
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
