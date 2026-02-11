package org.example.dsa.dequy

/*
Viết hàm đệ quy để tìm ước chung lớn nhất của 2 số nguyên dương sử dụng thuật toán Euclid
 */
fun ucln(a: Int, b: Int): Int {
    // dieu kien dung
    if (b == 0) return a
    // goi de quy
    return ucln(b, a % b)
}

fun main(){
    println("Nhap a :")
    val a = readln().toInt()
    println("Nhap b :")
    val b = readln().toInt()
    val kq = ucln(a, b)
    println("UCLN cua $a va $b = $kq")
}