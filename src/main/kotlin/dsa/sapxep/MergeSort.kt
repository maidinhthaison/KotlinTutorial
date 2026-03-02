package org.example.dsa.sapxep

import org.example.dsa.unSortedArray

// Chiến lược: Chia để trị
// https://www.youtube.com/watch?v=doPZMFphuno&t=37s
// 1. The Main Wrapper Function
fun mergeSort(arr: IntArray) {
    if (arr.size <= 1) return
    // Create ONE temporary array to save memory
    val temp = IntArray(arr.size)
    mergeSortHelper(arr, temp, 0, arr.size - 1)
}

// 2. The Recursive Divide Function
fun mergeSortHelper(arr: IntArray, temp: IntArray, left: Int, right: Int) {
    // Base Case: If the partition has 1 or 0 elements, it's sorted
    if (left >= right) return

    // Calculate mid to avoid integer overflow (better than (left + right) / 2)
    val mid = left + (right - left) / 2

    // Divide the left half
    mergeSortHelper(arr, temp, left, mid)
    // Divide the right half
    mergeSortHelper(arr, temp, mid + 1, right)

    // Conquer: Merge the two sorted halves
    merge(arr, temp, left, mid, right)
}

// 3. The Merge Logic (The heavy lifting)
fun merge(arr: IntArray, temp: IntArray, left: Int, mid: Int, right: Int) {
    // Copy data to our temporary array for this specific range
    for (i in left..right) {
        temp[i] = arr[i]
    }

    var i = left       // Pointer for the left half
    var j = mid + 1    // Pointer for the right half
    var k = left       // Pointer for the main array

    // Compare and copy the smaller elements back to the main array
    while (i <= mid && j <= right) {
        if (temp[i] <= temp[j]) {
            arr[k] = temp[i]
            i++
        } else {
            arr[k] = temp[j]
            j++
        }
        k++
    }

    // If the left half has remaining elements, copy them over.
    // (We don't need to copy the right half because they are already in the correct place)
    while (i <= mid) {
        arr[k] = temp[i]
        i++
        k++
    }
}

fun main() {

    mergeSort(unSortedArray)
    println(unSortedArray.contentToString())
}
