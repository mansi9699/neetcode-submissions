class Solution {
    fun majorityElement(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        var maxFreq = 0
        var n=0

        for(num in nums) {
            map[num] = (map[num] ?: 0) + 1
            if(map[num]!! > maxFreq) {
                maxFreq = map[num]!!
                n = num
            }
        }
        return n
    }
}
