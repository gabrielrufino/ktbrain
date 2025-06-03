package io.github.gabrielrufino.ktbrain.sorting

object SelectionSort {
    fun sort(array: IntArray) {
        val n = array.size

        for (i in 0 until n - 1) {
            var minIndex = i

            for (j in i + 1 until n) {
                if (array[j] < array[minIndex]) {
                    minIndex = j
                }
            }

            if (minIndex != i) {
                val temp = array[i]
                array[i] = array[minIndex]
                array[minIndex] = temp
            }
        }
    }
}
