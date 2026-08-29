class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix=""
        for(i in 0 until strs[0].length) {
            var flag = true
            for(j in 1 until strs.size) {
                if(strs[j].length==0) return ""
                if(i >= strs[j].length) return prefix
                if(strs[j][i] != strs[0][i]) {
                    flag = false
                }
            }
            if(flag==true) {
                prefix += strs[0][i]
            } else {
                return prefix
            }
        }
        return prefix
    }
}
