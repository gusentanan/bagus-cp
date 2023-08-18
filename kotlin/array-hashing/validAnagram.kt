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
        // we need to check if the two string have the same length, otherwise is not anagram
        if(s.length != t.length){
            return false 
        }

        var sMap = HashMap<Char, Int>()
        var tMap = HashMap<Char, Int>()

        /** 
          we need to add the two string (s and t) into corresponding HashMap (sMap and tMap)
          with the character as a key, and the total of unique character found in 
          the string as a value.
        */
        for(i in 0 until s.length){
            sMap[s[i]] = (sMap[s[i]]?:0) + 1 
            tMap[t[i]] = (tMap[t[i]]?:0) + 1 
            /**
                sMap[s[i]?:0] -> 
                using nsf operator, if the key is not found in the hashmap
                then we add 1 (0+1) as a default value, if the same character found then 
                we increase the value by one
            */
        }

        /**
          Iterate through the key to find the matches total unique character inside each of
          the hashmap. return false if any key value is not matches
         */
        for(key in sMap.keys){
            if(sMap.get(key) != tMap.get(key)){
                return false
            }
        }
        return true
    }
}

// Time: O(n) because we need to iterate through each string
// Space: O(s+t) because we need to make two hashmap