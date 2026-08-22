class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val result = IntArray(2*nums.size)
        for( i in 0 until (2*nums.size)) {
            if(i<nums.size) {
                result[i] = nums[i]
            } else {
                result[i] = nums[i-nums.size]
            }
        }
        return result
    }
}
