class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val diff = mutableMapOf<Int, Int>()
        // val res = IntArray(2)

        nums.forEachIndexed { i, num ->
            if(target-num in diff) {
                return intArrayOf(diff[target-num]!!, i)
                // res[0] = diff[target-num]!!
                // res[1] = i
                // return res
            }
            diff[num] = i
        }
        return intArrayOf(-1, -1)
    }
}
