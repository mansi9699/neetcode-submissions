/**
* Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).
**/
class Solution {
    fun isPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length-1

        while(l<r) {
            if(!s[l].isLetterOrDigit()) {
                l++
            } else if(!s[r].isLetterOrDigit()) {
                r--;
            } else {
                if(s[l]==s[r]) {
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
