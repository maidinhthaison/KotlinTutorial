package org.example.dsa.linkedlist



class Node(var value: Int){
    var next: Node? = null
}
class  LinkedList {
    var head: Node? = null
    fun addHead(value: Int) {
        val newNode = Node(value)
        newNode.next = head // New node points to current head
        head = newNode // New node becomes the new head
    }
    // Add to end: O(n) Time
    fun addLast(value: Int) {
        val newNode = Node(value)
        // If the list is empty, the new node becomes head
        if(head == null) {
            head = newNode
            return
        }
        // Otherwise, traverse to the very last node
        var current = head
        while (current?.next != null) {
            current = current.next
        }
        // Make the last node point to our new node
        current?.next = newNode
    }
    // Remove at a specific index: O(n) Time
    fun removeAtIndex(index: Int) {
        // Edge case: Empty list or invalid index
        if (head == null || index < 0) {
            print("Invalid index or empty list")
            return
        }
        // Edge case: Removing the head (index < 0 )
        if (index == 0){
            head = head?.next
            return
        }
        // Traverse to the node *right before* the one we want to remove
        var current = head
        for (i in 0 until index - 1 ) {
            if(current?.next == null) {
                print("Index out of bounds")
                return
            }
            current = current.next
        }
        // 'current' is now the node before the target
        // We skip over the target node
        val nodeToRemove = current?.next
        if(nodeToRemove != null) {
            current.next = nodeToRemove.next
        }else {
            print("Index out of bounds")
        }
    }
    fun printElement(){
        var current = head
        val result = mutableListOf<Int>()
        while (current != null) {
            result.add(current.value)
            current = current.next
        }
        println(result.joinToString(" -> ") + " -> null")
    }
    // Trả về index nếu tìm thấy, không có thì trả -1
    fun search(value: Int): Int {
        var current = head
        var index = 0
        while (current != null) {
            if (current.value == value) {
                return index
            }
            current =  current.next
            index++
        }
        return -1
    }
}
fun main(){
    val linkedList = LinkedList()
    // Add
    linkedList.addLast(10)
    linkedList.addLast(20)
    linkedList.addHead(5)
    linkedList.addLast(30)
    // List should be 5->10->20->30->null
    println("Khởi tạo danh sách liên kết")
    linkedList.printElement()

    // Tìm kiếm
    println("Index of 20 : ${linkedList.search(20)}") // Index 2
    println("Index of 100 : ${linkedList.search(100)}") //  -1

    // Xoá
    linkedList.removeAtIndex(0) // Remove 5 (head)
    println("After remove")
    linkedList.printElement()
}