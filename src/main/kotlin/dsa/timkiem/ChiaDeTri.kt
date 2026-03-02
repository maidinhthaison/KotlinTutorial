package org.example.dsa.timkiem

import org.example.dsa.unSortedArray

//Merge sort, Quick sort, Heap sort

fun findMax(arr: IntArray, left : Int, right: Int, n: Int): Int {
    if(left == right) return arr[left]
    val mid = left + (right - left) / 2
    val maxLeft = findMax(arr, left, mid, n)
    val maxRight = findMax(arr, mid + 1, right, n)
    if (maxLeft >= maxRight) return maxLeft
    return maxRight
}

fun main(){
    val n = unSortedArray.size
    unSortedArray.forEach { print("$it ") }
    val result = findMax(unSortedArray, 0, n - 1, n)
    println("Gia tri lon nhat: $result")
}