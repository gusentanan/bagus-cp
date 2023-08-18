// source: https://leetcode.com/problems/contains-duplicate

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        if(nums.isEmpty()){
            return false
        }
       var hashMap = HashMap<Int, Int>()

        for(i in 0 until nums.size){
            /**  
             Check through the array if the number is present as a key in our hashmap
             if false, we add those number as a key into our hashmap
             if true, we return true 
            */
            if(hashMap.containsKey(nums[i])){
                return true
            } else {
                /**
                 The value inside the HashMap is not useful; we only utilize the key.
                 When iterating through the array and finding a number that exactly
                 matches a key in our hashmap, we return true. This condition ensures 
                 that there is a maximum of one unique number in the hashmap.
                */
                hashMap[nums[i]] = i
            }
        }
        return false
    }
}

// time:  O(n) because we need to iterate through the array to fill the hashmap ( considering worst-case scenarios where we iterate until the last item in the array)
// space: O(n) because we need a new hashmap to store all the number from the array 

/**
 Another solution is using sorting method to sort the number inside the array then
 iterate through the sorted array to find the duplicate.
*/