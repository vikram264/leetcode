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
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        
        fast = head;
        
        slow = reverse(slow);
        
        
        while(slow!=null) {
            if(slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode curr=head;
        ListNode prev =null;
        
        
        while(curr!=null) {
            ListNode next = curr.next;
                     curr.next=prev;
                     prev = curr;
                     curr = next;
        }
        
        head = prev;
        return head;
    }
}