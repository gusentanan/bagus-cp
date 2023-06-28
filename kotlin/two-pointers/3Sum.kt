// Given an integer array nums, return all the triplets [nums[i], nums[j],
// nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.


class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var result: MutableList<List<Int>> = ArrayList()  
        var firstValue = 0
        var resultSum = 0
        
        nums.sort()
    
        for(i in 0 until nums.size){
            firstValue = nums[i]
            if(i > 0 && firstValue == nums[i-1]) // check if current value is not the same as before
                continue // if true, continue to next iteration
            
            var leftPointer = i+1
            var rightPointer = nums.size - 1
            while(leftPointer < rightPointer){
                resultSum = firstValue + nums[leftPointer] + nums[rightPointer]
                
                if(resultSum > 0){
                    rightPointer -= 1
                }else if(resultSum < 0){
                    leftPointer += 1
                }else{
                    result.add(
                        mutableListOf(firstValue, nums[leftPointer], nums[rightPointer])
                    )
                
                    leftPointer += 1
                    while(nums[leftPointer] == nums[leftPointer -1] && leftPointer < rightPointer){
                        leftPointer += 1
                    }
                }
            }
        } 
        
        return result
    }
}

// Time: O(n2)
// Space: O(n)