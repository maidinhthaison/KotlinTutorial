package org.example

class ObjectSingleton {
    fun main(){
        MyObject.doSomething()
        doSomething() // static method
    }
    object MyObject{
        fun doSomething(){
            println("MyObject doSomething")
        }
    }
//    companion object MyObject2{
//        fun doSomething(){
//            println("MyObject2 doSomething static")
//        }
//    }
//
    companion object MyObject3{
        @JvmStatic
        fun doSomething(){
            println("JvmStatic")
        }
    }
}