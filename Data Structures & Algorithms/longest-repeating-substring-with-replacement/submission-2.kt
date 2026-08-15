class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val charCount = mutableMapOf<Char, Int>()

        var res=0
        var l=0
        var r=0
        var maxFreq = 0

        while(r<s.length) {
            charCount[s[r]] = (charCount[s[r]] ?: 0) + 1

            maxFreq = max(maxFreq, charCount[s[r]]!!)

            if((r-l+1)-maxFreq > k) {
                charCount[s[l]] = charCount[s[l]]!! - 1
                l++
            }

            res = max(res, r-l+1)
            r++
        }
        return res
    }
}
