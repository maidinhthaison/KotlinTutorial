package org.example.dsa.queue


class QueueArray(private val capacity: Int) {
    private val array = IntArray(capacity)
    private var front = 0
    private var rear = -1
    var size =0
        private set // Read-only from outside

    // 1. Check if the queue is full
    fun isFull() : Boolean {
        return size == capacity
    }

    // 2. Check if the queue is empty
    fun isEmpty() : Boolean {
        return size == 0
    }
    // 3. Add an element to the rear (enqueue)
    fun enqueue(element: Int) {
        if(isFull()) {
            println("Queue is full")
            return
        }
        // The magic formular: wrap around to 0 if we hit the end
        rear = (rear + 1) % capacity
        array[rear] = element
        size++
    }
    // 4. Remove an element from the front (dequeue)
    fun dequeue() : Int? {
        if(isEmpty()){
            println("The queue is empty")
            return null
        }
        val dequeueElement = array[front]
        // Move front to forward, wrapping around if neccessary
        front = (front+1) % capacity
        size--
        return dequeueElement
    }
    // 5. Look at the front element without removing it (peek)
    fun peek() : Int? {
        if(isEmpty()){
            println("The queue is empty")
            return null
        }
        return array[front]
    }
    // 6. Search for an element (linear search)
    fun search(target: Int): Int {
        // We only iterate 'size' times, starting from 'front'
        for (i in 0 until size) {
            // Calculate the actual index in the circular array
            val actualIndex = (front + i) % capacity
            if (array[actualIndex] == target) {
                return i // Returns the relative position from the front
            }
        }
        return -1 // Not found
    }
    // 7. Print the queue elements in order
    fun display() {
        if (isEmpty()) {
            println("Queue: []")
            return
        }

        print("Queue: [")
        for (i in 0 until size) {
            val actualIndex = (front + i) % capacity
            print(array[actualIndex])
            if (i < size - 1) print(", ")
        }
        println("] (Size: $size, Capacity: $capacity)")
    }
}
fun main(){
    val size = 10
    val queue = QueueArray(size)
    for (i in 0 until size){
        queue.enqueue(i)
    }
    queue.display()
    println("Dequeue : ${queue.dequeue()}")
    queue.display()
    println("Front element is: ${queue.peek()}")
    println("Queue size is: ${queue.size}")
    println("Input target :")
    val target = readln().toInt()
    val result = queue.search(target)
    if(result == -1){
        println("Not Found")
    }else{
        println("Found at position: $result")
    }
}