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
    public ListNode removeNthFromEnd(ListNode head, int n) {
//         if(head == null){
//             return null;
//         }
//         int size = 0;
//         ListNode curr = head;
//         while(curr != null){
//             size++;
//             curr = curr.next;
//         }
        
//         if( n == size){
//             return head.next;
//         }
//         int indexToSearch = size - n;
//         ListNode prev = head;
//         int i=1;
//         while(i < indexToSearch){
//             prev = prev.next;
//             i++;
//         }
//         prev.next = prev.next.next;
//         return head;
        
        
        
        //Two pointer approach(Optimal Approach)
        
        ListNode fast = head, slow = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
        
    }
}