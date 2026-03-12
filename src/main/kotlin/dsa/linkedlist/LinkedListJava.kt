package org.example.dsa.linkedlist

import java.util.LinkedList

fun main(){
    // Instantiate the built-in Doubly Linked List
    val list = LinkedList<String>()
    println("-----Add-----")
    list.add("Apple")
    list.addFirst("Mango")
    list.addLast("Cherry")
    list.add(1,"Banana")
    println(list)

    val keyword = "Apple"
    println("Input search keywork = $keyword")
    val index = list.indexOf(keyword) // Returns 0-based index or -1
    val exist = list.contains(keyword) // Return True or False
    println("$keyword is exist?: $exist")
    println("keyword index: $index")

    println("-----Update at index = 1 by Pineapple-----")
    list[1] = "Pineapple"
    println(list)

    println("-----Remove Head-----")
    list.removeFirst() // Remove head
    println(list)
    println("-----Remove Pineapple-----")
    list.remove("Pineapple")
    println(list)
    println("-----Remove at index 1-----")
    list.removeAt(1)
    println(list)

}