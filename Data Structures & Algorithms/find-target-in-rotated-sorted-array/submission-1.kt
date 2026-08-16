class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size-1
        var mid: Int

        while(low<=high) {
            mid = (high+low)/2

            if(target==nums[mid]) {
                return mid
            }

            if(nums[low]<=nums[mid]) {
                if(target>=nums[low] && target<nums[mid]) {
                    high = mid-1
                } else {
                    low = mid+1
                }
            } else {
                if(target>nums[mid] && target<=nums[high]) {
                    low = mid+1
                } else {
                    high = mid-1
                }
            }
        }
        return -1
    }
}
