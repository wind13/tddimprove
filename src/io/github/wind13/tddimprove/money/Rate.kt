package io.github.wind13.tddimprove.money

class Rate(val currency1: String, val currency2: String, val rate: Int) {

    override fun equals(other: Any?): Boolean {
        return when (other) {
            !is Rate -> false
            else -> this === other ||
                    (currency1 == other.currency1 && currency2 == other.currency2 && rate == other.rate)
        }
    }

    override fun hashCode(): Int {
        var result = 17
        result = result * 31 + currency1.hashCode() + currency2.hashCode() + rate.hashCode()
        return result
    }

}
