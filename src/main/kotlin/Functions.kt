package org.example

class Functions {
    fun main(){
        sum(1, 2)
        println("Sum : ${sum(1, 2)}")
        val array = arrayOf(1,2,3,4,5)
        array.forEachIndexed { index, value ->
            print(evenOrOdd(value))
            print("\n")
        }
    }
    fun sum(a: Int, b: Int): Int = a.plus(b)
    fun evenOrOdd(number: Int): String {
        return if (number % 2 == 0) "Even" else "Odd"
    }

}