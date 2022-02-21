class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var firstIndices: Int ?= 0
        var secondIndices: Int ?= 0
        
        val hashMap = HashMap<Int, Int>()
        for(i in 0 until nums.size){
            val dif = target - nums[i]
            if(hashMap.containsKey(dif)){
                firstIndices = i
                secondIndices = hashMap[dif]
                break
            }else{
                val currValue = nums[i]
                hashMap.put(currValue, i)
            }
        }
        return intArrayOf(firstIndices!!, secondIndices!!)    
    }
}