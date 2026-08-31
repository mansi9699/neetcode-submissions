class Solution {
    fun addBinary(a: String, b: String): String {
        var carry = '0'
        var aa: String = b
        var bb: String = a
        if(a.length > b.length){
            aa = a
            bb = b
        }
        var res=""
        var j = bb.length-1

        for(i in aa.length-1 downTo 0) {
            var c1 = aa[i]
            println("c1 = $c1, i = $i")
            println("carry = $carry")
            if(j>=0) {
                var c2 = bb[j]
                if(c1=='0' && c2=='0') {
                    if(carry=='1') {
                        res = '1' + res
                    } else {
                        res = '0' + res
                    }
                    carry='0'
                } else if((c1=='0' && c2=='1') || (c1=='1' && c2=='0')) {
                    if(carry=='1') {
                        res = '0' + res
                        carry = '1'
                    } else {
                        res = '1' + res
                        carry='0'
                    }
                } else if(c1=='1' && c2=='1') {
                    if(carry=='1') {
                        res = '1' + res
                    } else {
                        res = '0' + res
                    }
                    carry = '1'
                }
                j--
            } else {
                if(carry=='1') {
                    if(c1=='0') {
                        res = aa.substring(0, i) + '1' + res
                        carry='0'
                        break
                    } else {
                        res = '0' + res
                    }
                } else {
                    res = aa.substring(0, i+1) + res
                    break
                }
            }
        }
        if(carry=='1') res = '1' + res
        return res
    }
}
