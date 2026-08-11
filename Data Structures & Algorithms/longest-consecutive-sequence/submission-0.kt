class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        // BRUTE FORCE - USING SORTING
        
        if(nums.size<=1) return nums.size

        nums.sort() // [0,1,1,2,3,4,5,6]        [2,3,4,5,5,10,20]
        var maxLen=1
        var len=1

        for(i in 1..nums.size-1) {
            if(nums[i]!=nums[i-1] && nums[i]-nums[i-1]==1) {
                len++
                maxLen = max(maxLen, len)
            } else if(nums[i]!=nums[i-1] && nums[i]-nums[i-1]>1) {
                len=1
            }
        }
        return maxLen
    }
}
