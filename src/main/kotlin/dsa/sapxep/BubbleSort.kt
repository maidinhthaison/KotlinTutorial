package org.example.dsa.sapxep

import org.example.dsa.swap
import org.example.dsa.unSortedArray

fun bubbleSortOptimize(arr: IntArray, n: Int) {
    var swapped: Boolean
    for (i in 0 until n - 1) {
        swapped = false
        for (j in 0 until n - 1 - i) {
            if (arr[j] > arr[j + 1]) {
                arr.swap(j, j + 1)
                swapped = true
            }
        }
        // Nếu không có hoán đổi nào -> mảng đã sắp xếp
        if (!swapped) break
    }
}

fun bubbleSort(arr: IntArray, n: Int) {
    for (i in 0 until n - 1) {
        for (j in 0 until n - 1 - i) {
            if (arr[j] > arr[j+1]) {
                arr.swap(j, j+1)
            }
        }
    }
}

fun main(){
    val n = unSortedArray.size
    //bubbleSortOptimize(unSortedArray, n)
    bubbleSort(unSortedArray, n)
    unSortedArray.forEach { print("$it ") }
}