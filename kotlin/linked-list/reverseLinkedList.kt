/**
Given the head of a singly linked list, reverse the list, and return the reversed list.
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
*/

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var curr = head
        var prev: ListNode ?= null; var next: ListNode ?= null

        // iterative > recursive 
        while(curr != null){
            next = curr?.next
            curr?.next = prev
            prev = curr
            curr = next

            print("Test -> ${curr?.`val`.toString()} \n")
        }

        return prev
    }
}

// Time = O(n) depends on how many elements are in the linked list itself
// Space = O(1) because we dont use any ds, only pointer