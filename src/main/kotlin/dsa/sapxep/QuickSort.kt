package org.example.dsa.sapxep

import org.example.dsa.swap
import org.example.dsa.unSortedArray


fun partition(arr: IntArray, low: Int, high: Int): Int {
    val pivot = arr[high] // We chose the last element as the pivot

    // 'i' keeps track of the boundary for elements smaller than the pivot
    var i = low - 1

    // Iterate from 'low' up to the element just before the pivot
    for (j in low until high) {
        // If the current element is smaller than or equal to the pivot...
        if (arr[j] <= pivot) {
            i++ // Expand the boundary of smaller elements
            arr.swap(i, j) // Throw the smaller element into that boundary
        }
    }

    // Finally, place the pivot exactly after the boundary of smaller elements.
    // This puts the pivot in its final, correctly sorted position!
    arr.swap(i + 1, high)

    // Return the final index of the pivot
    return i + 1
}

// 3. The Recursive QuickSort Function
fun quickSort(arr: IntArray, low: Int, high: Int) {
    if (low < high) {
        // pi is the Partitioning Index. arr[pi] is now in its correct place.
        val pi = partition(arr, low, high)

        // Recursively sort the left side of the pivot
        quickSort(arr, low, pi - 1)

        // Recursively sort the right side of the pivot
        quickSort(arr, pi + 1, high)
    }
}

fun main(){
    val n = unSortedArray.size
    quickSort(unSortedArray,0,n - 1)
    println(unSortedArray.contentToString())
}