package io.github.gabrielrufino.ktbrain.sorting

import kotlin.test.Test
import kotlin.test.assertContentEquals

class SelectionSortTest {

    @Test
    fun `test sort empty array`() {
        val arr = arrayOf<Int>()
        SelectionSort.sort(arr)
        assertContentEquals(arrayOf<Int>(), arr)
    }

    @Test
    fun `test sort single element array`() {
        val arr = arrayOf<Int>(42)
        SelectionSort.sort(arr)
        assertContentEquals(arrayOf<Int>(42), arr)
    }

    @Test
    fun `test sort already sorted array`() {
        val arr = arrayOf<Int>(1, 2, 3, 4, 5)
        SelectionSort.sort(arr)
        assertContentEquals(arrayOf<Int>(1, 2, 3, 4, 5), arr)
    }

    @Test
    fun `test sort reverse sorted array`() {
        val arr = arrayOf<Int>(5, 4, 3, 2, 1)
        SelectionSort.sort(arr)
        assertContentEquals(arrayOf<Int>(1, 2, 3, 4, 5), arr)
    }

    @Test
    fun `test sort random array`() {
        val arr = arrayOf<Int>(64, 25, 12, 22, 11)
        SelectionSort.sort(arr)
        assertContentEquals(arrayOf<Int>(11, 12, 22, 25, 64), arr)
    }

    @Test
    fun `test sort array with duplicates`() {
        val arr = arrayOf<Int>(3, 1, 2, 3, 1)
        SelectionSort.sort(arr)
        assertContentEquals(arrayOf<Int>(1, 1, 2, 3, 3), arr)
    }
}
