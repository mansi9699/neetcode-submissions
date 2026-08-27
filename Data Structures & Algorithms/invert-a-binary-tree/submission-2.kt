/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if(root == null) return null
        val treeNodes = mutableListOf<TreeNode>()

        treeNodes.add(root)

        while(!treeNodes.isEmpty()) {
            var temp = treeNodes.removeLast()
            temp.left?.let{ left ->
                treeNodes.add(left)
            }
            temp.right?.let { right ->
                treeNodes.add(right)
            }
            swapChild(temp)
        }
        return root
    }

    private fun swapChild(parent: TreeNode) {
        var temp = parent.left
        parent.left = parent.right
        parent.right = temp
    }
}
