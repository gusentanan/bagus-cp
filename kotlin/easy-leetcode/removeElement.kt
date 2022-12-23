/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may 
be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part 
of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the 
final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Example:
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).

*/

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        // Note
        // 1. nums array adalah number yang tidak sama dengan val (input)
        // 2. return sisa elemen yang terdapat pada array setelah number yang sama dengan val (input) dihapus

        val targetNum = `val`
        var leftPointer = 0
        var rightPointer = nums.size - 1
        var res = 0

        while(leftPointer <= rightPointer){
            if(nums[leftPointer] != targetNum){
                leftPointer++
                res++
                continue
            }
            if(nums[rightPointer] == targetNum){
                rightPointer--
                continue
            }
            nums[leftPointer] = nums[rightPointer].also { nums[rightPointer] = nums[leftPointer] }
        }

        return res
    }
}

// Time: O(n)
// Space: O(1)