// you are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of 
// elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, 
// nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 
// and should be ignored. nums2 has a length of n.

// Example 1:

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var lastIndices = m + n - 1
        var i = m
        var y = n
        
        while(i > 0 && y > 0){
            if(nums1[i-1] > nums2[y-1]){
                nums1[lastIndices] = nums1[i-1]
                i -= 1 
            }else{
                nums1[lastIndices] = nums2[y-1]
                y -= 1
            }
            lastIndices -= 1 
        }
        
        while(y > 0){
            nums1[lastIndices] = nums2[y-1]
            y = y - 1
            lastIndices = lastIndices - 1
        }
    }
}

// Time : O(n) because we need to iterate through the array
// Space: O(1) because we use the existing array as a result 