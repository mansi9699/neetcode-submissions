class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val res = mutableListOf<List<String>>()

        val mapOfAnagrams = mutableMapOf<List<Int>, MutableList<String>>()
        var charCountList: List<Int>

        for(str in strs) {
            charCountList = getCharsCount(str)
            // if(checkifExistsInMap(mapOfAnagrams, charCountArr)) {
            if(charCountList in mapOfAnagrams) {
                println(str)
                mapOfAnagrams[charCountList]?.add(str)
            } else {
                mapOfAnagrams[charCountList] = mutableListOf(str)
            }
        }

        for(list in mapOfAnagrams.values) {
            res.add(list)
        }        
        return res
    }

    private fun getCharsCount(str: String): List<Int> {
        val res = MutableList<Int>(26) {0}
        for (ch in str) {
            res[ch-'a']++
        }
        return res
    }

    // private fun validAnagrams(key: IntArray, current: IntArray): Boolean {
    //     for(i in 0..25) {
    //         if(key[i]!=current[i]) return false
    //     }
    //     return true
    // }

    // private fun checkifExistsInMap(mapOfAnagrams: Map<List<Int>, List<String>>, arr: List<Int>): Boolean {
    //     for(k in mapOfAnagrams.keys) {
    //         if(validAnagrams(k, arr)) {
    //             return true
    //         }
    //     }
    //     return false
    // }
}
