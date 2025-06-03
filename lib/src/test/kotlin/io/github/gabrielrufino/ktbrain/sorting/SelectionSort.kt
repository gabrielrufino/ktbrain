package io.github.gabrielrufino.ktbrain.sorting

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SelectionSortTest {

    @Test
    fun `test sort empty array`() {
        val arr = intArrayOf()
        SelectionSort.sort(arr)
        assertContentEquals(intArrayOf(), arr)
    }

    @Test
    fun `test sort single element array`() {
        val arr = intArrayOf(42)
        SelectionSort.sort(arr)
        assertContentEquals(intArrayOf(42), arr)
    }

    @Test
    fun `test sort already sorted array`() {
        val arr = intArrayOf(1, 2, 3, 4, 5)
        SelectionSort.sort(arr)
        assertContentEquals(intArrayOf(1, 2, 3, 4, 5), arr)
    }

    @Test
    fun `test sort reverse sorted array`() {
        val arr = intArrayOf(5, 4, 3, 2, 1)
        SelectionSort.sort(arr)
        assertContentEquals(intArrayOf(1, 2, 3, 4, 5), arr)
    }

    @Test
    fun `test sort random array`() {
        val arr = intArrayOf(64, 25, 12, 22, 11)
        SelectionSort.sort(arr)
        assertContentEquals(intArrayOf(11, 12, 22, 25, 64), arr)
    }

    @Test
    fun `test sort array with duplicates`() {
        val arr = intArrayOf(3, 1, 2, 3, 1)
        SelectionSort.sort(arr)
        assertContentEquals(intArrayOf(1, 1, 2, 3, 3), arr)
    }
}
