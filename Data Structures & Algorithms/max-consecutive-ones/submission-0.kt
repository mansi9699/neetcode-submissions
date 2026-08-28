class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var c=0
        for(num in nums) {
            if(num==1) {
                c++
                max = maxOf(max, c)
            } else {
                c=0
            }
        }
        return max
    }
}
