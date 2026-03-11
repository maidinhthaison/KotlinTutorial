package org.example.dsa.tree

// Duyệt các node có level cao trước
/**
 * In BFS a node is visited first, then all it's children, then all it's grandchildren.
 * Explores the tree level by level, from top to bottom, left to right.
 */
fun breathFirstSearch(root: TreeNode?) {
    if(root == null) return
    // Create a Queue
    val queue = ArrayDeque<TreeNode>()
    queue.addLast(root) // enqueue the root
    while(queue.isNotEmpty()) {
        // Dequeue the front node
        val current = queue.removeFirst()
        print("${current.value} ")

        // If it has a left child, queue it up for the next level
        if(current.left != null) {
            queue.addLast(current.left!!)
        }

        // If it has a right child, queue it up for the next level
        if(current.right != null) {
            queue.addLast(current.right!!)
        }
    }
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

    print("BFS (Level Order)     : ")
    breathFirstSearch(root)
}