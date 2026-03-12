package org.example.dsa.sapxep

import org.example.dsa.unSortedArray

// https://www.youtube.com/watch?v=EL8BSp1qKrg&list=PLyxSzL3F7486C1hibGV8XTzB09qC5-bWp&index=13
// https://www.w3schools.com/dsa/dsa_algo_insertionsort.php
fun executeInsertionSort(arr: IntArray, n: Int) {
    for (i in 1 until n ) {
        val key = arr[i]
        var j = i - 1
        while (j >=0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j--
        }
        arr[j + 1] = key
    }
}

fun main() {
    val n = unSortedArray.size
    executeInsertionSort(unSortedArray, n)
    unSortedArray.forEach { print("$it ") }
}