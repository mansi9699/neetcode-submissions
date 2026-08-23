class Solution {
    fun scoreOfString(s: String): Int {
        var sum = 0
        for(i in 1 until s.length) {
            sum += (s[i]-s[i-1]).absoluteValue
        }
        return sum
    }
}
