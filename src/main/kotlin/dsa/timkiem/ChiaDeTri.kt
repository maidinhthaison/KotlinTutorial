package org.example.dsa.timkiem

import org.example.dsa.unSortedArray

//Merge sort, Quick sort, Heap sort
// Tìm phần tử lớn nhất bằng chia để trị
fun findMax(arr: IntArray, left : Int, right: Int): Int {
    if(left == right) return arr[left]
    val mid = left + (right - left) / 2
    val maxLeft = findMax(arr, left, mid)
    val maxRight = findMax(arr, mid + 1, right)
    if (maxLeft >= maxRight) return maxLeft
    return maxRight
}

fun main(){
    val n = unSortedArray.size
    unSortedArray.forEach { print("$it ") }
    val result = findMax(unSortedArray, 0, n - 1)
    println("Gia tri lon nhat: $result")
}