package org.example.dsa.sapxep

import org.example.dsa.swap
import org.example.dsa.unSortedArray


fun executeSelectionSort(arr: IntArray, n: Int) {

    for (i in 0 until n - 1) {
        var minIndex = i
        for (j in i + 1 until n) {
            if(arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }
        arr.swap(i, minIndex)
    }
}

fun main(){
    val n = unSortedArray.size
    executeSelectionSort(arr = unSortedArray, n)
    unSortedArray.forEach { print("$it ") }
}