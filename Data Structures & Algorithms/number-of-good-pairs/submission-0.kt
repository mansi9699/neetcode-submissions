class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var c=0
        for(i in 0..nums.size-1) {
            for(j in i+1..nums.size-1) {
                if(nums[i]==nums[j] && i<j) {
                    c++
                }
            }
        }
        return c
    }
}