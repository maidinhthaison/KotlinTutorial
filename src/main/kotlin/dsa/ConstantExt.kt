package org.example.dsa

val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

val unSortedArray = intArrayOf(2, 1, 4, 5, 3, 7, 6, 8, 10, 9)


fun IntArray.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}

fun CharArray.swap(i: Int, j: Int) {
    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}