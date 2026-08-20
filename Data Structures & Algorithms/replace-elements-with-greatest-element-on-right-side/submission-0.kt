class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        val result = IntArray(arr.size)

        result[arr.size-1] = -1
        var max = -1

        for( i in arr.size-2 downTo 0) {
            if(arr[i+1]>max) {
                max = arr[i+1]
            }
            result[i] = max
        }

        return result
    }
}
