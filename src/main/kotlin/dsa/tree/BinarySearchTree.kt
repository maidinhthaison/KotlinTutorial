package org.example.dsa.tree

/**
 * Because it is a BST, we will use an Inorder Traversal (Left -> Root -> Right).
 * Why? Because an Inorder traversal of a BST will magically print the numbers in perfectly sorted order!
 *        50
 *       /  \
 *      40  60
 *     /   /  \
 *    20  55   70
 *   /        /  \
 * 15        65   80
 * Notice the beauty of this structure: If you pick ANY node, everything to its left is strictly smaller,
 * and everything to its right is strictly larger!
 * Because it is a BST, we will use an Inorder Traversal (Left -> Root -> Right).
 * Why? Because an Inorder traversal of a BST will magically print the numbers in perfectly sorted order!
 */
class BinarySearchTree {
    var root: BinaryTreeNode? = null

    // 1. Insert node
    fun insert(value: Int) {
        root = insertRecursive(root, value)
    }

    // Recursive helper function to find the correct spot for the new value
    private fun insertRecursive(
        current: BinaryTreeNode?,
        value: Int
    ): BinaryTreeNode {
        if(current == null) return BinaryTreeNode(value) // Found an empty spot, create the node!
        if(value < current.value) {
            current.left = insertRecursive(current.left, value) // Go left
        }else if(value > current.value) {
            current.right = insertRecursive(current.right, value) // Go right
        }
        return current // return the unchanged node pointer
    }
    // 2. Travese
    fun inorderTraversal(node: BinaryTreeNode?) {
        if(node == null) return
        inorderTraversal(node.left) // Go all the left
        print("${node.value} ") // Print the node
        inorderTraversal(node.right) // Go right
    }
    // 3. Search: No queue or stack needed!
    fun search(target: Int): Boolean {
        var current = root
        while (current != null) {
            if(target == current.value) return true // Found
            // Choose our path based on the value
            current = if (target < current.value) {
                current.left // Target is smaller, ignore the right half
            }else{
                current.right
            }
        }
        return false // Reached a dead end
    }
}
fun main(){
    val bst = BinarySearchTree()
    // Insert values from your original tree
    val values = intArrayOf(50, 60, 40, 70, 80, 55, 20, 15, 65)
    for(value in values) {
        bst.insert(value)
    }
    // 1. Traverse the tree
    println("InorderTraversal (Should be sorted): ")
    bst.inorderTraversal(bst.root)

    // 2. Search for elements
    val search1 = 65
    val search2 = 99

    println()

    println("Is $search1 in the tree? ${bst.search(search1)}")
    // Output: Is 65 in the tree? true

    println("Is $search2 in the tree? ${bst.search(search2)}")
    // Output: Is 99 in the tree? false
}