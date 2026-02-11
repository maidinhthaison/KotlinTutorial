package org.example.dsa.dequy

fun tinhGiaiThua(n : Int) : Long{
    return if(n==0){
        // cơ sở (điều kiện dừng)
        1
    }
    else{
        // đệ quy
        // n! = n * (n-1)
        n.times(tinhGiaiThua(n-1))
    }

}

fun main(){
    println("Nhap n: ")
    val n = readln().toInt()
    val giaiThua = tinhGiaiThua(n)
    println("Ket qua $n ! = $giaiThua")
}