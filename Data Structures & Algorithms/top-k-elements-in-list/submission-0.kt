class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = mutableMapOf<Int, Int>()

        for(num in nums) {
            if(num in freqMap) {
                freqMap[num] = freqMap[num]!! + 1
            }
            else {
                freqMap[num] = 1
            }
        }

        val pq = PriorityQueue<Pair<Int, Int>>(compareBy {it.second})

        for(key in freqMap.keys) {
            pq.add(key to freqMap[key]!!)

            if(pq.size>k) pq.poll()
        }

        val result = IntArray(k)
        var i=0
        for(pair in pq) {
            result[i] = pair.first
            i++
        }
        return result
    }
}
