package io.github.gabrielrufino.ktbrain.search

object BinarySearch {
    fun <T: Comparable<T>> search(list: List<T>, target: T): Int {
        var left = 0
        var right = list.size - 1

        while (left <= right) {
            val middle = (left + right) / 2
            when {
                list[middle] == target -> return middle
                list[middle] < target -> left = middle + 1
                else -> right = middle - 1
            }
        }
        return -1
    }
}
