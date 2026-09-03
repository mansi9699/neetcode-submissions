class Solution {
    fun maxDifference(s: String): Int {
        val freq = IntArray(26)

        for(c in s) {
            freq[c-'a']+=1
        }

        var maxOdd=0
        var minEven=s.length

        for(i in 0..25) {
            if(freq[i]!=0 && freq[i]%2 != 0 && freq[i]>maxOdd) {
                maxOdd = freq[i]
            }
            if(freq[i]!=0 && freq[i]%2 ==0 && freq[i]<minEven) {
                minEven = freq[i]
            }
        }
        println("max = $maxOdd, min = $minEven")
        return maxOdd-minEven
    }
}
