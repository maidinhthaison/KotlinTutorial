package org.example

class OOP {
    fun main(){

        val child = Child()
        println(">>> Parent was called first then child")

        val onePlus = OnePlus()
        onePlus.display()
        println("Override variable : ${onePlus.name}")
        //
        println("---Polymorphism---")
        val circle = Circle(2.0)
        println("Circle Area : ${circle.area()}")
        val square = Square(2.0)
        println("Square Area : ${square.area()}")

        println("--------------")
        val circle2 = Circle(2.0)
        val square2 = Square(2.0)
        calculate(arrayOf(circle2, square2))
    }
    open inner  class Parent(){
        init {
            println("Parent Init")
        }
    }

    inner class Child : Parent(){
        init {
            println("Child Init")
        }
    }
    //
    open inner  class Mobile {
        open fun display() = println("Simple Mobile Display")
        open val name : String? = null
    }

    inner class OnePlus : Mobile() {
        override fun display() = println("Override method display")
        override val name: String = "abc"
    }

    //polymorphism
     open inner class Shape {
        open fun area() : Double {
            return 0.0
        }
     }
    inner class Circle(val radius: Double) : Shape() {
        override fun area(): Double {
            return radius.times(radius).times(Math.PI)
        }
    }
    inner class Square(val side: Double) : Shape() {
        override fun area(): Double {
            return side.times(side)
        }
    }

    fun calculate (shapeArray: Array<Shape>){
        for (shape in shapeArray){
            println(shape.area())
        }
    }
}

