package org.example

class Loops {
    fun main(){
        for (i in 0..10) {
            print("$i ")
        }
        println("\nUtil:")
        for (i in 0 until 10) {
            print("$i ")
        }
        println("\nStep:")
        for (i in 0..10 step 2) {
            print("$i ")
        }
        println("\nDownTo:")
        for (i in 10 downTo 0 step 3) {
            print("$i ")
        }
    }
}