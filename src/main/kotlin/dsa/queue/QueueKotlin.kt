package org.example.dsa.queue

/*
Using Kotlin's native ArrayDeque is the most modern and efficient way to handle Queues (and Stacks!) in Kotlin.
It gives you the speed of an array without the hassle of manually managing the "wrap-around"
pointers we did in the custom Circular Queue.

Since ArrayDeque is a "Double-Ended Queue," it has methods to add or remove from both ends.
To use it as a standard FIFO (First-In, First-Out) Queue,
we restrict ourselves to adding at the end (addLast) and removing from the front (removeFirst).

Here is how you can wrap Kotlin's built-in ArrayDeque to implement exactly the functions you asked for:
enqueue, dequeue, display, and search.*/
class ModernQueue<T> {
    // Initialize Kotlin's native ArrayDeque
    private val deque = ArrayDeque<T>()
    // 1. Enqueue: Add an element to the rear of the queue
    fun enqueue(element: T) {
        deque.addLast(element) // Equivalent to Java's offer()
    }
    // 2. Dequeue: Remove and return the front element safely
    fun dequeue(): T? {
        // removeFirstOrNull() prevent crashes if the queue is empty
        val removed = deque.removeFirstOrNull()
        if(removed == null){
            println("Queue is empty")
        }
        return removed
    }
    // 3. Search: Find the 0-based index of an element from the front
    fun search(target: T): Int {
        // ArrayDeque in Kotlin implements this list interface,
        // so it already has a highly optimized built-in indexOf function
        return deque.indexOf(target)
    }
    // 4. Display: print the current state of the queue
    fun display(){
        if(deque.isEmpty()){
            println("Queue is empty")
        }else{
            // Kotlin collection have built-in toString() formatting
            println("Queue : $deque (Size: ${deque.size})")
        }
    }
    // 5. Peek at the front element without removing it
    fun peek() : T? {
        return deque.firstOrNull()
    }
    // 6. Get size
    fun size(): Int {
        return deque.size
    }
}

fun main(){
    val queue = ModernQueue<Int>()
    for (i in 0 until 10){
        queue.enqueue(i)
    }
    queue.display()
    println("Dequeue : ${queue.dequeue()}")
    queue.display()
    println("Front element is: ${queue.peek()}")
    println("Queue size is: ${queue.size()}")
    println("Input target :")
    val target = readln().toInt()
    val result = queue.search(target)
    if(result == -1){
        println("Not Found")
    }else{
        println("Found at position: $result")
    }

}