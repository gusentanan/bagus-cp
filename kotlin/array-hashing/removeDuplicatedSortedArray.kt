/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of 
the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the 
final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).

*/
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var res = 1

        for(i in 1 until nums.size){
            // swap if left pointer != right pointer, if true then we can assure the right pointer is unique
            // in this case, left pointer = res, right pointer = i
            if(nums[i-1] != nums[i]){
                nums[res] = nums[i]
                res++  
            }
        }
        return res
    }
}

// Time: O(n) 
// Space: O(1) 