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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
      
        ListNode result = temp;
        
        int sum = 0, carry = 0;
        
        while(l1!=null || l2!=null) {
            int val1 = l1!=null ? l1.val:0;
            int val2 = l2!=null ? l2.val:0;
            
             sum = val1+val2+carry;
            carry = sum/10;
            int remainder = sum%10;
            result.next = new ListNode(remainder);
            
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
            
            result = result.next;
        }
        
        
        if(carry>0) {
            result.next = new ListNode(carry);
        }
        
        
        return temp.next;
    }
}