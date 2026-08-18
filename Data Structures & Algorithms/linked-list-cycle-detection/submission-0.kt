/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if(head==null) return false

        val visitedNodes = mutableSetOf<ListNode>()
        var curr = head
        while(curr != null) {
            if(curr in visitedNodes) return true

            visitedNodes.add(curr)
            curr = curr.next
        }
        return false
    }
}
