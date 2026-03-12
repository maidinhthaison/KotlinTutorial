package org.example.dsa.tree

class BinaryTreeNode(var value: Int) {
    var left: BinaryTreeNode? = null
    var right: BinaryTreeNode? = null

}
fun createBinaryTree(): BinaryTreeNode {
    /* Let's build this tree:
             50
           /   \
          60     40
         / \     \
        70   80   55
           / \   /
          20  15 65
    */
    val root = BinaryTreeNode(50)
    root.left = BinaryTreeNode(60)
    root.right = BinaryTreeNode(40)
    root.left!!.left = BinaryTreeNode(70)
    root.left!!.right = BinaryTreeNode(80)
    root.left!!.right!!.left = BinaryTreeNode(20)
    root.left!!.right!!.right = BinaryTreeNode(15)
    root.right!!.right = BinaryTreeNode(55)
    root.right!!.right!!.left = BinaryTreeNode(65)
    return root
}

