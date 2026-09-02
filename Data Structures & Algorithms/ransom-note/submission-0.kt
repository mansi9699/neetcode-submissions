class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val freqM = IntArray(26)

        for(c in magazine) {
            freqM[c-'a']+=1
        }

        val freqR = IntArray(26)

        for(c in ransomNote) {
            freqR[c-'a']+=1
            if(freqR[c-'a']>freqM[c-'a']) return false
        }
        return true
    }
}
