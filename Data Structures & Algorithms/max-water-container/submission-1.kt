class Solution {
    fun maxArea(heights: IntArray): Int {
        var maxArea = 0
        var i=0
        var j = heights.size-1
        while(i<j) {
        maxArea = max(maxArea, min(heights[i], heights[j])*(j-i))
        if(heights[i]<heights[j]) {
        i++
        } else {
        j--
        }
        }
        
                    return maxArea

    }
}
