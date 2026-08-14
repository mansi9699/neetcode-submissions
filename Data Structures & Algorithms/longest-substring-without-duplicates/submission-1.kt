class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.length==0 || s.length==1) return s.length

        val charCount = mutableMapOf<Char, Int>()

        var l=0
        var r=0
        var maxLen = 0
        var len = 0

        while(l<=r && r<s.length) {
            if(s[r] in charCount) {
                charCount.remove(s[l])
                l++
            } else {
                charCount[s[r]] = 1
                r++
            }
            len = r-l
            maxLen = max(maxLen, len)
        }
        return maxLen
    }
}
