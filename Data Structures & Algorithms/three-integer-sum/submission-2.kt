class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        // -4, -1, -1, 0, 1 ,2
        val result = mutableSetOf<List<Int>>()
        nums.sort()
        for(i in 0..nums.size-1) {
            if(i!=0 && nums[i]==nums[i-1]) continue
            var l=0
            var r=nums.size-1
            while(l<r) {
                if(l==i) {
                    l++
                } else if(r==i) {
                    r--
                } else {
                    if(nums[l]+nums[r] == (-1*nums[i])) {
                        var subList = mutableListOf(nums[l], nums[r], nums[i])
                        subList.sort()
                        result.add(subList)
                        l++
                        r--
                    } else if(nums[l]+nums[r] > (-1*nums[i])) {
                        r--
                    } else {
                        l++
                    }
                }
            }
        }
        return result.toList()
    }
}
