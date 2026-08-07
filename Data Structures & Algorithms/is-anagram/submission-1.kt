class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val countOfChars = Array(26) {0}

        for(c in s){
            countOfChars[c-'a']++
        }

        for(c in t) {
            countOfChars[c-'a']--
            if(countOfChars[c-'a']<0){
                return false
            }
        }
        return true
    }
}
