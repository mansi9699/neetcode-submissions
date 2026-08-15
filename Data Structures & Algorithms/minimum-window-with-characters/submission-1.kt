class Solution {
    fun minWindow(s: String, t: String): String {
        val countTarget = mutableMapOf<Char, Int>()
        var countT=0

        for(c in t) {
            countTarget[c] = (countTarget[c] ?: 0) + 1
        }
        countT = countTarget.size

        var l=0
        var r=0
        val charTrack = mutableMapOf<Char, Int>()
        var have=0
        var resLen = Int.MAX_VALUE
        var resL=-1
        var resR=-1

        while(r<s.length) {
            charTrack[s[r]] = (charTrack[s[r]] ?: 0) + 1
            if(s[r] in countTarget && charTrack[s[r]] == countTarget[s[r]]) {
                have++
            }

            while(have==countT) {
                if(r-l+1 < resLen) {
                    resL= l
                    resR = r
                    resLen = r-l+1
                }
                charTrack[s[l]] = charTrack[s[l]]!! - 1
                
                if(s[l] in countTarget && charTrack[s[l]]!! < countTarget[s[l]]!!) {
                    have--
                }
                l++
            }
            r++
        }
        if(resLen!=Int.MAX_VALUE) {
            return s.substring(resL..resR)
        } else {
            return ""
        }
        
    }
}
