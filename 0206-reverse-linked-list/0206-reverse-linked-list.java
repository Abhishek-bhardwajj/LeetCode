/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        //Recursive approach.
        
        // if(head == null)
        //     return null;
        // else if(head.next==null){
        //     return head;
        // }
        // else{
        //     ListNode nextNode = head.next;
        //     head.next = null;
        //     ListNode rest = reverseList(nextNode);
        //     nextNode.next = head;
        //     return rest;
        // }
        
        
        //Iterative approach
        
        ListNode newhead = null;
        while(head != null){
            ListNode next = head.next;
            head.next = newhead;
            newhead = head;
            head = next;
        }
        return newhead;
    }
}