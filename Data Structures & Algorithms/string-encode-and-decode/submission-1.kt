class Solution {

    fun encode(strs: List<String>): String {
        var res = StringBuilder("")
        strs.forEach { str ->
            res.append(str.length)
            res.append("#")
            res.append(str)
        }
        return res.toString()
    }

    fun decode(str: String): List<String> {
        var mid: String=""
        var ch: Char
        var len: String=""
        val res = mutableListOf<String>()
        var i=0
        while(i<str.length) {
            ch = str[i]
            if(ch>='0' && ch<='9') {
                len+=ch
            } else if(ch=='#'){
                res.add(str.substring(i+1, i+1+len.toInt()))
                i = i+len.toInt()
                len=""
            }
            i++
        }
        return res
    }
}
