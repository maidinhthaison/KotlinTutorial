package org.example


class AbstractClass {
    fun main() {
        val circle = Circle(4.0)
        val square = Square(4.0)
        println(circle.area())
        println(square.area())
    }
    abstract inner class Shape {
        abstract fun area(): Double
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
}