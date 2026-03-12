package org.example.dsa.tree

// Duyệt các node có level cao trước
/**
 * In BFS a node is visited first, then all it's children, then all it's grandchildren.
 * Explores the tree level by level, from top to bottom, left to right.
 */
class BinaryTreeBFS {
    // 1. Traverse: Print all elements level by level
    fun traverse(root: BinaryTreeNode?) {
        if (root == null) return
        // use ArrayDeque as a FIFO Queue
        val queue = ArrayDeque<BinaryTreeNode>()
        queue.addLast(root) // 1: Add root to the back
        while (queue.isNotEmpty()) {
            // 2. Remove from the front
            val current = queue.removeFirst()
            // 3 Process the node
            print("${current.value} ")
            // 4. Add children to the back
            if(current.left != null) {
                queue.addLast(current.left!!)
            }
            if(current.right != null) {
                queue.addLast(current.right!!)
            }
        }
        println()
    }
    // 2: Search: Find if a specific integer exists in the tree
    fun searchBinaryTree(root: BinaryTreeNode?, target: Int): Boolean {
        if (root == null) return false
        val queue = ArrayDeque<BinaryTreeNode>()
        queue.addLast(root)
        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()
            // Process: Did we find the target?
            if(current.value == target) {
                return true // Found! stop searching
            }
            // Queue up the next level
            if(current.left != null) {
                queue.addLast(current.left!!)
            }
            if(current.right != null) {
                queue.addLast(current.right!!)
            }
        }
        return false
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
    val binaryTreeBFS = BinaryTreeBFS()
    print("BFS Traverse: ")
    binaryTreeBFS.traverse(root)
    println("Input target: ")
    val target = readln().toInt()
    val isFounded: Boolean = binaryTreeBFS.searchBinaryTree(root, target)
    if(isFounded) {
        println("Found")
    }else{
        println("Not Found")
    }

}