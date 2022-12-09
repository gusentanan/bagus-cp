/**
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
Example:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
*/

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var list3 = Utils()
        // temporary var to store the list 
        var temp1 = list1
        var temp2 = list2

        // check if the list is null
        if(list1 == null){
            return list2
        } 
        if(list2 == null){
            return list1
        } 
        if(list1 == null && list2== null){
            return null
        }


        while(temp1?.`val` != null && temp2?.`val` != null){
            if(temp1?.`val` <= temp2?.`val`){
                list3.addList(temp1?.`val`)
                temp1 = temp1.next
            } else {
                list3.addList(temp2?.`val`)
                temp2 = temp2.next
            }
        }

        if(temp1 != null){
            while(temp1 != null){
                list3.addList(temp1?.`val`)
                temp1 = temp1.next
            }
        } else {
            while(temp2 != null){
                list3.addList(temp2?.`val`)
                temp2 = temp2.next
            }
        }

        return list3.getFirstNode()

    }
}

// class to build the result list
class Utils(private var firstNode: ListNode? = null, private var lastNode: ListNode? = null){
    fun addList(value: Int){
        var newNode = ListNode(value)
        if(firstNode == null){
            // add newNode to both pointer
            firstNode = newNode
            lastNode = newNode
        } else {
            // add newNode to the last index
            lastNode?.next = newNode
            lastNode = lastNode?.next
        }
    }

    fun getFirstNode() = firstNode

}