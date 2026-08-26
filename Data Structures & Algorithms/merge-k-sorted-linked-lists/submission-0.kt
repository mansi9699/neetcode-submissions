/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if(lists.size==0) return null
        val pq = PriorityQueue<Pair<Int, ListNode>>(compareBy {it.first})

        for(i in 0 until lists.size) {
            if(lists[i]!=null) {
                pq.add(Pair(lists[i]!!.`val`, lists[i]!!))
            }
        }
        val dummy = ListNode(-1)
        var temp = dummy
        var top: Pair<Int, ListNode>

        while(!pq.isEmpty()) {
            top = pq.poll()
            var value: Int = top.first
            var node: ListNode = top.second

            temp.next = node
            temp = temp.next!!

            if(node.next!=null) {
                pq.add(Pair(node.next!!.`val`, node.next!!))
            }
        }
        temp.next = null
        return dummy.next
    }
}
