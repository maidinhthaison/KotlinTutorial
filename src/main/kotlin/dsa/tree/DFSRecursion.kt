package org.example.dsa.tree

/**
 * Depth-First Search (DFS): Goes as deep as possible down one path before coming back up.
 * This includes Preorder, Inorder, and Postorder.
 * We use Recursion (which is essentially a Stack under the hood) for these.
 */

/**
 * Use Case: Copying a tree.
 * Root -> Left -> Right
 */

fun preorderTraversal(node: TreeNode?) {
    if (node == null) return
    print("${node.value} ") // 1. Process ROOT
    preorderTraversal(node.left) // 2. Go Left
    preorderTraversal(node.right) // 3. Go Right
}

/**
 * Use Case: If you do this on a Binary Search Tree (BST), it returns the elements in perfectly sorted, ascending order!
 * Left -> Root -> Right
 */
fun inorderTraversal(node: TreeNode?) { // Left -> Root -> Right
    if (node == null) return
    inorderTraversal(node.left) // 1. Go left
    print("${node.value} ") // 2. Process Root
    inorderTraversal(node.right) // 3. Go right
}
/**
 * Use Case: Deleting a tree. You must delete the children (leaves) before you can delete the parent root.
 * Left -> Right -> Root
 */
fun postorderTraversal(node: TreeNode?) {
    if (node == null) return
    postorderTraversal(node.left) // 1. Go Left
    postorderTraversal(node.right) // 2. Go Right
    print("${node.value} ") // 3. Process Root
}

fun main(){
    /* Let's build this tree:
             F
           /   \
          B     G
         / \     \
        A   D     I
           / \   /
          C   E H
    */
    val root = TreeNode('F')
    root.left = TreeNode('B')
    root.right = TreeNode('G')
    root.left!!.left = TreeNode('A')
    root.left!!.right = TreeNode('D')
    root.left!!.right!!.left = TreeNode('C')
    root.left!!.right!!.right = TreeNode('E')
    root.right!!.right = TreeNode('I')
    root.right!!.right!!.left = TreeNode('H')

    println("DFS Preorder Traversal Root -> Left -> Right ")
    preorderTraversal(root)
    println()
    println("DFS inorder Traversal Left -> Root -> Right")
    inorderTraversal(root)
    println()
    println("DFS Postorder Traversal Left -> Right -> Root")
    postorderTraversal(root)
}