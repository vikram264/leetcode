/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode prev = temp;
        ListNode curr = head;
        while(curr!=null) {
            
            ListNode tail = curr;
            int index = 0;
            while(curr!=null && k>index) {
               curr = curr.next;
                index ++;
            }
            
            if(index!=k) {
                prev.next = tail;
            } else {
                prev.next = reverse(tail,k);
                prev = tail;
            }
        }
        return temp.next;
        
    }
    
    
   public ListNode reverse(ListNode head,int k) {
        
       ListNode curr = head;
       ListNode prev = null;
       
       while(curr!=null && k>0) {
           
           ListNode next = curr.next;
           curr.next = prev;
           prev=curr;
           curr = next;
           
           k--;
       }
        head = prev;
       return head;
        
    }
}