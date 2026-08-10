class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = mutableMapOf<Int, Int>()

        for(num in nums) {
            if(num in freqMap) freqMap[num]++
            else freqMap[num] = 1
        }

        val pq = PriorityQueue<Pair<Int, Int>>(comapreBy {it.second})

        for(key in freqMap) {
            pq.add(key to freqMap[key])

            if(pq.size>k) pq.poll()
        }

        val result = IntArray(k)
        for(pair in pq) {
            result[k--] = pair.first
        }
        return result
    }
}
