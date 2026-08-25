class Solution {
    fun countSeniors(details: Array<String>): Int {
        var age: String = ""
        var c = 0
        for(pass in details) {
            age = pass.substring(11, 13)
            if(age.toInt()>60) c++
        }
        return c
    }
}
