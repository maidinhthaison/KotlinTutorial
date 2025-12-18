package org.example

class Arrays {
    fun main(){
        val array = IntArray(5)
        for (i in 0 until array.size){
            println("Input number ${i+1}")
            array[i] = readln().toInt()
        }
        print("\n")
        array.forEach{
            print("$it ")
        }
        print("\n")
        array.forEach(::print)
        print("\n")
        for (i in array.indices){
            print("${array[i]} ")
        }
        print("\n")
        array.forEachIndexed { index, value -> print("($index - $value)") }
    }
}