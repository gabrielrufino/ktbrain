package io.github.gabrielrufino.ktbrain.search

import kotlin.test.Test
import kotlin.test.assertEquals

class BinarySearchTest {

    @Test
    fun testIntSearch_Found() {
        val list = listOf(1, 3, 5, 7, 9, 11, 13)
        assertEquals(3, BinarySearch.search(list, 7))
        assertEquals(0, BinarySearch.search(list, 1))
        assertEquals(6, BinarySearch.search(list, 13))
    }

    @Test
    fun testIntSearch_NotFound() {
        val list = listOf(1, 3, 5, 7, 9, 11, 13)
        assertEquals(-1, BinarySearch.search(list, 6))
        assertEquals(-1, BinarySearch.search(list, 0))
        assertEquals(-1, BinarySearch.search(list, 14))
    }

    @Test
    fun testStringSearch_Found() {
        val list = listOf("apple", "banana", "cherry", "date")
        assertEquals(2, BinarySearch.search(list, "cherry"))
        assertEquals(0, BinarySearch.search(list, "apple"))
        assertEquals(3, BinarySearch.search(list, "date"))
    }

    @Test
    fun testStringSearch_NotFound() {
        val list = listOf("apple", "banana", "cherry", "date")
        assertEquals(-1, BinarySearch.search(list, "orange"))
        assertEquals(-1, BinarySearch.search(list, ""))
    }

    @Test
    fun testEmptyList() {
        val list = emptyList<Int>()
        assertEquals(-1, BinarySearch.search(list, 1))
    }

    @Test
    fun testSingleElementList() {
        val list = listOf(5)
        assertEquals(0, BinarySearch.search(list, 5))
        assertEquals(-1, BinarySearch.search(list, 10))
    }
}
