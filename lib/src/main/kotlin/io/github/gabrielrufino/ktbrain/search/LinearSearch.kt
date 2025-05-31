package io.github.gabrielrufino.ktbrain.search

object LinearSearch {
    fun <T> search(list: List<T>, target: T): Int {
        for (index in list.indices) {
            if (list[index] == target) {
                return index
            }
        }

        return -1
    }
}
