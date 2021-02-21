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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        ListNode l1 = head;
        
        
        while(fast!=null && fast.next!=null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = null;
        
        slow = reverse(slow);
        merge(l1,slow);
    }
    
    // 1 2 3 4
    // 8 7 6 5
    
    public void merge(ListNode l1, ListNode l2) {
        
        while(l1!=null) {
             ListNode l1next = l1.next;//2
             ListNode l2next = l2.next;//7
            
            l1.next = l2;// 1-8
            if(l1next == null) break;
            
            l2.next = l1next;
            l1 = l1next;
            l2 = l2next;
            
        }
    }
    
    public ListNode reverse ( ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!=null) {
            ListNode next = curr.next;
             curr.next = prev;
             prev =   curr;
             curr = next;
        }
        head = prev;
        return head;
    }
}