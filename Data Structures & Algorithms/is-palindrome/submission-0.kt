class Solution {
    fun isPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length-1

        while(l<r) {
            if(!s[l].lowercaseChar().isLetterOrDigit()) {
                l++
            } else if(!s[r].lowercaseChar().isLetterOrDigit()) {
                r--;
            } else {
                if(s[l].lowercaseChar()==s[r].lowercaseChar()) {
                    l++
                    r--
                } else {
                    return false
                }
            }
        }
        return true

    }
}
