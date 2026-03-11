package org.example.dsa.stack

// Stack (LIFO): Add to the back (addLast), Remove from the back (removeLast).
// We use a generic type <T> so the stack can hold any data type
class ModernStack<T> {
    private val deque = ArrayDeque<T>()

    // 1. Push: Add an element to the Top of the stack
    fun push(element: T) {
        deque.addLast(element)
    }
    // 2. Pop: Remove and return the TOP element safely
    fun pop(): T? {
        // removeLastOrNull() prevents crashes if the stack is empty
        val removed = deque.removeLastOrNull()
        if(removed == null){
            println("Stack is empty")
        }
        return removed
    }
    // 3. Peek: look at the TOP element without removing it
    fun peek(): T? {
        return deque.lastOrNull()
    }
    // 4. Check if the stack is empty
    fun isEmpty(): Boolean {
        return deque.isEmpty()
    }
    // 5. Display: Print the current state of the stack
    fun display(){
        if(deque.isEmpty()){
            println("Stack is empty")
        }else{
            // Reversing just for display so the "top" (last element) show first
            println("Stack (Top to bottom) is ${deque.reversed()} (Size: ${deque.size})")
        }
    }
    // 6. Search: Returns the 1-based position from the top of the stack
    fun search(target : T) : Int {
        return deque.indexOf(target)
    }
}
fun main(){
    val stack = ModernStack<Int>()
    for (i in 0 until 10){
        stack.push(i)
    }
    println("Stack origin: ")
    stack.display()
    println("Stack pop: ")
    stack.pop()
    stack.display()
    val element = stack.peek()
    println("Stack peek without remove : $element")
    stack.display()
    println("Input target: ")
    val target = readln().toInt()
    val result = stack.search(target)
    println("Result: $result")
    if(result != -1){
        println("Found at position: $result")
    }else{
        println("Not found")
    }
}