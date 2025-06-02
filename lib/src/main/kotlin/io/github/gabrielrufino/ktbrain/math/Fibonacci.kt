package io.github.gabrielrufino.ktbrain.math

object Fibonacci {
    fun calculate(n: Int): Long {
        require(n >= 0) { "n must be non-negative" }
        return when (n) {
            0 -> 0
            1 -> 1
            else -> calculate(n - 1) + calculate(n - 2)
        }
    }
}
