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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        
        ListNode curr = head;
        ListNode prev = null;
        
        while(m>1) {
            prev = curr;
            curr = curr.next;
            m--;
            n--;
            
        }
        
        ListNode tail = curr;//2
        ListNode connection = prev;//1
        
        
        while(n>0) {
            ListNode next = curr.next;
                curr.next = prev;
                 prev = curr;
                 curr = next;
            n--;
        }
        
        if(connection!=null) {
            connection.next = prev;
        } else {
            head = prev;
        }
        
        tail.next = curr;
        return head;
    } 
}