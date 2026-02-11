package org.example.dsa.dequy

fun fibonacci(n: Int): Long {
    // điều kiện dừng (cơ cở)
    if (n == 0) return 0
    if (n == 1) return 1
    // gọi đệ quy
    return fibonacci(n - 1) + fibonacci(n - 2)
}

fun main(){
    println("Nhap n: ")
    val n = readln().toInt()
    val ketQua = fibonacci(n)
    println("Ket qua fibonacci cua $n = $ketQua")
}