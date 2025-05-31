package io.github.gabrielrufino.ktbrain.search

import kotlin.test.Test
import kotlin.test.assertEquals

class LinearSearchTest {
    @Test
    fun `should find existing element`() {
        val list = listOf(10, 20, 30, 40)
        val idx = LinearSearch.search(list, 30)
        assertEquals(2, idx)
    }

    @Test
    fun `should return -1 for non-existing element`() {
        val list = listOf(10, 20, 30, 40)
        val idx = LinearSearch.search(list, 99)
        assertEquals(-1, idx)
    }
}
