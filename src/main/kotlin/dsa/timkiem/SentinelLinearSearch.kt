package org.example.dsa.timkiem

import org.example.dsa.array

fun sentinelLinearSearch(array: IntArray,  k: Int): Int {
    val n = array.size
    val last = array[n - 1] // phần tử cuối
    array[n - 1] = k // đặt lính canh
    var i = 0
    while (array[i] != k) {
        i++
    }
    array[n - 1] = last // khôi phục lại mảng
    if (i < n - 1 || last == k) {
        return i // tìm thấy
    }
    return -1 // không tìm thấy
}

fun main() {

    array.forEach { print("$it ") }
    println("Nhap so can tim :")
    val k = readln().toInt()
    val vitri = sentinelLinearSearch(array, k)
    if (vitri == -1) {
        println("Khong tim thay gia tri $k")
    } else {
        println("Tim thay $k tai vi tri $vitri")
    }
}