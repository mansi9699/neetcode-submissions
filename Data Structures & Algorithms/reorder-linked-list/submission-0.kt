/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    var curr: ListNode? = null
    var done: Boolean = false
    fun reorderList(head: ListNode?): Unit {
        curr = head
        done = false
        solve(head)
    }

    fun solve(head: ListNode?) {
        if (head == null) {
            return
        }
        solve(head.next)
        if (done) return

        if (curr == head || curr?.next == head) {
            head.next = null
            done = true
        } else {
            val temp = curr?.next
            curr?.next = head
            head.next = temp
            curr = temp
        }
    }
}