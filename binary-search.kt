class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left: Int = 0
        var right: Int = nums.size - 1
        
        while(left <= right){
            var middle: Int = (left + right) 
            
            if(nums[middle] == target){
                return middle
            }else if(nums[middle] > target){
                right = middle - 1 
            }else{
                left = middle + 1
            }
        }
        return -1
    }
}