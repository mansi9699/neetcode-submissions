/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    var i: Int = 0
    var nodeToRemove: ListNode? = null
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        solve(head, n)
        if(nodeToRemove!=null) {
            nodeToRemove= null
            return head?.next
        }
        return head
    }

    fun solve(head: ListNode?, n:Int) {
        if(head==null) return
        solve(head?.next, n)
        
        // returning from recursion
        i++
        if(i==n) {
            nodeToRemove = head
            return
        }
        if(nodeToRemove !=null) {
            head.next = nodeToRemove?.next
            nodeToRemove?.next = null
            nodeToRemove = null
            return
        }
    }
}
