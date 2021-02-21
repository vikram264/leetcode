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
    public ListNode deleteDuplicates(ListNode head) {
   
        
        if(head == null) return null;
        
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode curr = temp;
        
        while(curr.next!=null && curr.next.next!=null) {
            
            
            
            if(curr.next.val == curr.next.next.val) {
                int dup = curr.next.val;
                while(curr.next!=null && curr.next.val == dup) {
                    curr.next = curr.next.next;
                }
                
            } else {
                curr = curr.next;
            }
        }
           
        
        return temp.next;
        
    }
}