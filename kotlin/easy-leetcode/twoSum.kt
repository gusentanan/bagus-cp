// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int,Int>()
        
        for(i in 0 until nums.size){
            var diff = target - nums[i]
            if(hashMap.containsKey(diff)){
                return intArrayOf(i,  hashMap[diff] as Int)
            }else{
                hashMap.put(nums[i],i)
            }
        }
        return intArrayOf()
    }
}

// Time: O(n) because we need to iterate through the array
// Space: O(n) because we need add every value to the hashmap