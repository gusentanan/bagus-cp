/* 
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example:
Input: s = "()[]{}"
Output: true

Input: s = "(]"
Output: false
*/

class Solution {
    fun isValid(s: String): Boolean {
        // hashmap solution
        val hashMap = mapOf('}' to '{', ')' to '(', ']' to '[')
        var myStack = Stack<Char>()

        s.forEach{
            if(!isValidCharacters(it) && s.length % 2 != 0){
                return false
            }
            if(it == ']' || it == ')' || it == '}'){
                // check if the value is in the stack
                if(myStack.isEmpty() || myStack.peek() != hashMap[it]) return false
                // if above condition is false then pop the current value in the stack
                myStack.pop()
            }else {
                myStack.push(it)
            }
        }
        // if stack empty, its means every characters is valid
        return myStack.isEmpty()
    }

    private fun isValidCharacters(c: Char): Boolean {
        if(c in 'A'..'Z' || c in 'a'..'z' || c in '0'..'9'){
            return false
        }
        return true
    }
}

// Time: O(n)
// Space: O(hashMap + myStack) 