package org.example.dsa.timkiem

import org.example.dsa.array

fun binarySearchByLoop(arr: IntArray,  k: Int): Int {
    val n = arr.size
    var left = 0
    var right = n -1
    while (left <= right) {
        val mid = (left + right) / 2
        if(arr[mid] == k) {
            return mid // tìm thấy ngay giữa
        }else if(arr[mid] > k) {
            right = mid - 1 // tìm bên trái
        }else{
            left = mid + 1 // tìm bên phải
        }
    }
    return -1
}

fun binarySearchByRecursion(arr : IntArray, left: Int, right: Int, k: Int): Int {
    if(left > right) // dieu kien dừng
        return -1 // khong tim thay
    val mid = left + (right - left) / 2
    if(arr[mid] == k) {
        return mid
    }else if(arr[mid] > k) {
        return binarySearchByRecursion(arr, left, mid - 1, k) // tim ben trai
    }else{
        return binarySearchByRecursion(arr, mid + 1, right, k) // tim ben phai
    }
}

fun main(){
    array.forEach { print("$it ") }
    println("Nhap so can tim :")
    val k = readln().toInt()
    //val vitri = binarySearchByLoop(array, k)
    val vitri = binarySearchByRecursion(array, 0, array.size - 1, k)
    if (vitri == -1) {
        println("Khong tim thay gia tri $k")
    } else {
        println("Tim thay $k tai vi tri $vitri")
    }
}