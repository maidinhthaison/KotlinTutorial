package org.example

class WhenUtils {
    fun main(){
        val animal = "Dog"
        val result = when (animal) {
            "Dog" -> "A Dog"
            "Cat" -> "A Cat"
            else -> "Neither a cat nor a dog"
        }
        println(result)
    }
}