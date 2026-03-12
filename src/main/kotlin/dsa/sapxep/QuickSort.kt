package org.example.dsa.sapxep

import org.example.dsa.swap
import org.example.dsa.unSortedArray


fun partition(arr: IntArray, left: Int, right: Int): Int {
    val pivot = arr[right] // We chose the last element as the pivot

    // 'i' keeps track of the boundary for elements smaller than the pivot
    var i = left - 1

    // Iterate from 'low' up to the element just before the pivot
    for (j in left until right) {
        // If the current element is smaller than or equal to the pivot...
        if (arr[j] <= pivot) {
            i++ // Expand the boundary of smaller elements
            arr.swap(i, j) // Throw the smaller element into that boundary
        }
    }

    // Finally, place the pivot exactly after the boundary of smaller elements.
    // This puts the pivot in its final, correctly sorted position!
    i++
    arr.swap(i, right)

    // Return the final index of the pivot
    return i
}

// 3. The Recursive QuickSort Function
fun quickSort(arr: IntArray, left: Int, right: Int) {
    if (left < right) {
        // pi is the Partitioning Index. arr[pi] is now in its correct place.
        val pi = partition(arr, left, right)

        // Recursively sort the left side of the pivot
        quickSort(arr, left, pi - 1)

        // Recursively sort the right side of the pivot
        quickSort(arr, pi + 1, right)
    }
}

fun main(){
    val n = unSortedArray.size
    println("Unsorted array: ")
    println(unSortedArray.contentToString())
    println("After quicksort: ")
    quickSort(unSortedArray,0,n - 1)
    println(unSortedArray.contentToString())
}