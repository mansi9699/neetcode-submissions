class Solution {
    fun reverseString(s: CharArray) {
        var l=0
        var r = s.size-1
        var temp: Char

        while(l<r) {
            temp = s[l]
            s[l] = s[r]
            s[r] = temp
            l++
            r--
        }
    }
}
