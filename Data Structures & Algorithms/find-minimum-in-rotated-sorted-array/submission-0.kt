class Solution {
    fun findMin(nums: IntArray): Int {
        // Brute force
        var minNum=nums[0]
        for(i in 1..<nums.size) {
            minNum = min(nums[i], minNum)
        }
        return minNum
    }
}
