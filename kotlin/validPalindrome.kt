// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters
// , it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

class Solution {
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1
        
        while(left < right){
            while(left < right && !isAlphaNum(s[left])){
                left += 1
            }
            while(right > left && !isAlphaNum(s[right])){
                right -= 1
            }
            if(s[left].toLowerCase() != s[right].toLowerCase()){
                println("${s[left]} == ${s[right]}")
                return false
            }
            left = left + 1
            right = right - 1
        }
        return true
    }
    
    private fun isAlphaNum(s: Char): Boolean {
        if(s in 'A'..'Z' || s in 'a'..'z' || s in '0'..'9')
            return true
        
        return false
    }
 }

// Time: O(n) because we have to iterate through every character inside the string
// Space: O(1) 
// because we dont use extra space to store the reverse new string instead we use pointer to point left and right character in the same string