class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val prefix = IntArray(nums.size)
        val suffix = IntArray(nums.size)
        val res = IntArray(nums.size)

        prefix[0]=1

        for(i in 1..<nums.size) {
            prefix[i] = prefix[i-1]*nums[i-1]
        }

        suffix[nums.size-1] = 1
        for(i in nums.size-2 downTo 0) {
            suffix[i] = suffix[i+1]*nums[i+1]
        }

        for(i in 0..nums.size-1) {
            res[i] = prefix[i]*suffix[i]
        }

        return res
    }
}
