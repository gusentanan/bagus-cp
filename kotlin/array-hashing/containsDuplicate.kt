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
                 The value inside the HashMap is useless, we only use the key so that when we
                 iterate through the array and found the number that exactly matches the key 
                 in our hashmap, return true! 
                 (condition. Max 1 unique number in hashmap)
                */
                hashMap[nums[i]] = i
            }
        }
        return false
    }
}

// time:  O(n) because we need to iterate through the array to fill the hashmap (base on worst cases which we iterate until the last item on the array)
// space: O(n) because we need a new hashmap to store all the number from the array 

/**
 Another solution is using sorting method to sort the number inside the array then
 iterate through the sorted array to find the duplicate.
*/