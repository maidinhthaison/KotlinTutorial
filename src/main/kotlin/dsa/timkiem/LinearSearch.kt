package org.example.dsa.timkiem

import org.example.dsa.array

fun linearSearch(array : IntArray, k: Int) : Int {
    val n = array.size
    for (i in 0 until n) {
        if (array[i] == k) {
            return i
        }
    }
    return -1
}

fun main () {
    array.forEach { print("$it ") }
    println("Nhap so can tim :")
    val k = readln().toInt()
    val vitri = linearSearch(array, k)
    if (vitri == -1){
        println("Khong tim thay gia tri $k")
    }else{
        println("Tim thay $k tai vi tri $vitri")
    }
}