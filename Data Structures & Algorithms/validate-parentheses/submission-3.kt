class Solution {
    fun isValid(s: String): Boolean {
        if(s.length<=1) return false
        val stack = mutableListOf<Char>()

        for(c in s) {
            if(c=='(' || c=='{' || c=='[') {
                stack.add(c)
            } else {
                if(stack.isEmpty()) return false
                if((c==')' && stack[stack.size-1]=='(')
                || (c==']' && stack[stack.size-1]=='[')
                || (c=='}' && stack[stack.size-1]=='{')) {
                    stack.removeAt(stack.size-1)
                } else {
                    return false
                }
            }
        }
        if(stack.isEmpty()) return true
        else return false
    }
}
