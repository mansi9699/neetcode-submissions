class Solution {
    fun stringMatching(words: Array<String>): List<String> {
        val resset = mutableSetOf<String>()
        for(i in 0 until words.size) {
            for(j in 0 until words.size) {
                if(i!=j && words[i].contains(words[j])) {
                    resset.add(words[j])
                }
            }
        }
        return resset.toList()
    }
}
