// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
         // MutableSet is a collection of elements that does not support duplicate elements
        var setNumbers = mutableSetOf<Int>() 
        
        for(number in nums){
            if(!setNumbers.add(number))
                return true
        }
        return false
    }
}

// time: O(n) Linear time
// space: O(n)