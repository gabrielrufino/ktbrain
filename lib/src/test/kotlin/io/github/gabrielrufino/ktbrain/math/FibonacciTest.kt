package io.github.gabrielrufino.ktbrain.math

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class FibonacciTest {
    @Test
    fun `should return correct Fibonacci numbers`() {
        assertEquals(0, Fibonacci.calculate(0))
        assertEquals(1, Fibonacci.calculate(1))
        assertEquals(1, Fibonacci.calculate(2))
        assertEquals(2, Fibonacci.calculate(3))
        assertEquals(3, Fibonacci.calculate(4))
        assertEquals(5, Fibonacci.calculate(5))
        assertEquals(8, Fibonacci.calculate(6))
        assertEquals(13, Fibonacci.calculate(7))
        assertEquals(21, Fibonacci.calculate(8))
        assertEquals(34, Fibonacci.calculate(9))
    }

    @Test
    fun `should throw exception for negative input`() {
        assertFailsWith<IllegalArgumentException> {
            Fibonacci.calculate(-1)
        }
    }
}
