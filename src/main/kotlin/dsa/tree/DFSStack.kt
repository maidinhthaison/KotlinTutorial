package org.example.dsa.tree

fun iterativePreorder(root: TreeNode?) {
    if (root == null) return

    // Create our explicit Stack
    val stack = ArrayDeque<TreeNode>()
    stack.addLast(root)

    while (stack.isNotEmpty()) {
        // 1. Pop the top node (Root)
        val current = stack.removeLast()
        print("${current.value} ")

        // 2. Push RIGHT child first (so it sits at the bottom)
        if (current.right != null) {
            stack.addLast(current.right!!)
        }

        // 3. Push LEFT child second (so it sits at the top and pops next!)
        if (current.left != null) {
            stack.addLast(current.left!!)
        }
    }
}

fun iterativeInorder(root: TreeNode?) {
    val stack = ArrayDeque<TreeNode>()
    var current = root // A pointer to track where we are

    // We continue if there are unvisited nodes OR nodes left in the stack
    while (current != null || stack.isNotEmpty()) {

        // 1. Travel as far left as possible, saving nodes to the stack
        while (current != null) {
            stack.addLast(current)
            current = current.left
        }

        // 2. We hit null (no more left children). Pop the top node.
        current = stack.removeLast()

        // 3. Process (Print) the node
        print("${current.value} ")

        // 4. Move to the right child and repeat the whole process
        current = current.right
    }
}

fun iterativePostorder(root: TreeNode?) {
    if (root == null) return

    val stack = ArrayDeque<TreeNode>()
    // We use another ArrayDeque as a LinkedList to add elements to the front (reversing them)
    val result = ArrayDeque<Char>()

    stack.addLast(root)

    while (stack.isNotEmpty()) {
        val current = stack.removeLast()

        // Add to the FRONT of our result list (this does the reversing!)
        result.addFirst(current.value)

        // Push LEFT first, then RIGHT (so right pops first for our modified preorder)
        if (current.left != null) {
            stack.addLast(current.left!!)
        }
        if (current.right != null) {
            stack.addLast(current.right!!)
        }
    }

    // Print the reversed result
    for (value in result) {
        print("$value ")
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

    println("DFS Preorder Traversal Root -> Left -> Right ")
    iterativePreorder(root)
    println()
    println("DFS inorder Traversal Left -> Root -> Right")
    iterativeInorder(root)
    println()
    println("DFS Postorder Traversal Left -> Right -> Root")
    iterativePostorder(root)
}