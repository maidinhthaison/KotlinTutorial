package org.example.dsa.tree

import java.util.Stack

/*
Using an ArrayDeque as a Stack to explore a Binary Tree means we are performing an Iterative Depth-First Search (DFS).

Because a Stack follows the LIFO (Last-In, First-Out) rule, we don't need the system's invisible recursion stack anymore.
We control the memory ourselves!

The "Trick" to Stacks and Trees
When using a Stack for standard DFS (Preorder), there is one golden rule:
You must push the RIGHT child into the stack before the LEFT child. Why? Because the last thing you put into a stack
is the first thing that comes out. If you want to explore the left side first, you have to put it in last so it sits on top!
 */
class BinaryTreeDFS {
    // --- 1. TRAVERSE (Iterative Preorder DFS) ---
    // Plunges down the left side, then backs up to the right
    // Root - > Left -> Right
    fun traverse(root: BinaryTreeNode?) {
        if(root == null) return
        // Initialize ArrayQueue as a Stack
        val stack = ArrayDeque<BinaryTreeNode>()
        stack.addLast(root) // Push the root onto the stack

        while(stack.isNotEmpty()) {
            val current = stack.removeLast()
            print("${current.value} ") // process it
            // Push right first (so it sits at the bottom)
            if(current.right != null) {
                stack.addLast(current.right!!)
            }
            // Push left second (so it sits at the top and pops next)
            if(current.left != null) {
                stack.addLast(current.left!!)
            }
        }
        println()
    }
    // --- 2. SEARCH (Iterative DFS) ---
    // Looks for a target value by plunging down branches
    fun search(root: BinaryTreeNode?, target: Int): Boolean {
        if(root == null) return false
        val stack = ArrayDeque<BinaryTreeNode>()
        stack.addLast(root)
        while(stack.isNotEmpty()) {
            val current = stack.removeLast()
            // Did we find the target?
            if(current.value == target) {
                return true
            }
            // Push right, then left
            if(current.right != null) {
                stack.addLast(current.right!!)
            }
            if(current.left != null) {
                stack.addLast(current.left!!)
            }
        }
        return false // stack is empty, target not found
    }
}
fun main(){
    /* Let's build this tree:
              50
            /   \
           60    40
          / \     \
         70  80   55
            / \   /
           20  15 65
     */

    val root = createBinaryTree()
    val dfs = BinaryTreeDFS()
    // 1. Traverse
    println("DFS Traversal")
    dfs.traverse(root)
    // 2. Search
    println("Input target: ")
    val target: Int = readln().toInt()
    println("Is $target in the tree? ${dfs.search(root, target)}")
}