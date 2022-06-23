// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
// typically using all the original letters exactly once

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length)
            return false
    
        var sHashMap = HashMap<Char, Int>()
        var tHashMap = HashMap<Char, Int>()
        
        for(i in 0 until s.length){
            sHashMap[s[i]] = (sHashMap[s[i]]?:0) + 1
            tHashMap[t[i]] = (tHashMap[t[i]]?:0) + 1
        }
        for(key in sHashMap.keys){
            if(sHashMap.get(key) != tHashMap.get(key))
                return false
        }
        return true
    }
}

// Time: O(n) because we need to iterate through each string
// Space: O(s+t) because we need to make two hashmap