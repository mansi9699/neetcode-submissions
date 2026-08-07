class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val uniqueNums = mutableSetOf<Int>()

        for (num in nums) {
            if(uniqueNums.contains(num)) {
                return true
            }
            uniqueNums.add(num)
        }
        return false
    }
}
