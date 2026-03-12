package org.example.dsa.queue

/*
Hàng đợi (Queue) là một cấu trúc dữ liệu tuyến tính hoạt động theo nguyên tắc
FIFO (First In First Out) - vào trước ra trước.

Ứng dụng thực tế
Hệ thống xử lý yêu cầu: Hàng đợi in ấn, xử lý công việc
Thuật toán BFS: Duyệt đồ thị theo chiều rộng
Hàng đợi CPU: Quản lý tiến trình
Hàng đợi tin nhắn: Xử lý message queue trong hệ thống phân tán
Mô phỏng: Mô phỏng hàng chờ tại ngân hàng, sân bay

Các thao tác chính:
enqueue(value): Thêm phần tử vào cuối hàng đợi
dequeue(): Xóa và trả về phần tử ở đầu hàng đợi
front(): Xem phần tử ở đầu (không xóa)
rear(): Xem phần tử ở cuối (không xóa)
isEmpty(): Kiểm tra hàng đợi có rỗng không
size(): Lấy số lượng phần tử

Khởi tạo: Queue rỗng
[]

enqueue(10): [10]
enqueue(20): [10, 20]
enqueue(30): [10, 20, 30]
↑front    ↑rear

dequeue(): Xóa 10 → [20, 30]
↑front ↑rear

front(): Trả về 20 (không xóa)
rear(): Trả về 30 (không xóa)*/

// 1. Define the Node Class
class Node<T>(var data : T) {
    var next: Node<T>? = null
}

// 2. Define the Queue class
class QueueLinkedList<T> {
    private var front: Node<T>? = null
    private var rear: Node<T>? = null
    var size: Int = 0
        private set

    // check if queue is empty
    fun isEmpty(): Boolean {
        return front == null
    }

    // Add an element to the back of the queue
    fun enqueue(element: T) {
        val newNode = Node(element)
        // if queue is empty, then new node is both front and rear
        if(rear == null) {
            front = newNode
            rear = newNode
        }else{
            // Add the new node at the end of queue and change rear
            rear!!.next = newNode
            rear = newNode
        }
        size++
    }
    // Remove and element from the front of the queue
    fun dequeue(): T? {
        // If queue is empty, return null
        if(isEmpty()){
            println("Queue is empty")
            return null
        }
        // Store previous front and move front one node ahead
        val tempNode = front
        front = front?.next
        // If front become null, then change rear also to null
        if (front == null){
            rear = null
        }
        size--
        return tempNode?.data
    }
    // get the front element without removing it
    fun peek(): T? {
        if(isEmpty()){
            println("Queue is empty")
            return null
        }
        return front?.data
    }
    // print all elements in the queue
    fun display(){
        if(isEmpty()){
            println("Queue is empty")
            return
        }
        var current = front
        print("Queue :")
        while(current != null){
            print("${current.data} -> ")
            current = current.next
        }
        println("Null")
    }

    fun search (target : T) : Int {
        var current = front
        var index = 0
        // Traverse the linked list from front to rear
        while (current != null){
            if(current.data == target){
                return index // Found!
            }
            current = current.next // Move to next node
            index++
        }
        return -1 // Not found
    }
}
fun main(){
    val queue = QueueLinkedList<Int>()
    for (i in 0 until 10){
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