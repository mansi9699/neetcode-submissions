class Solution {
    fun lengthOfLastWord(s1: String): Int {
        val s = s1.trim()

        var i = s.length - 1
        var c=0
        while(i>=0 && s[i]!=' ') {
            c++
            i--
        }
        return c
    }
}
