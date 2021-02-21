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
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode cur = head, pre = null;    // pre.next == cur
        while (cur != null) {
            int i = m, j = n;
            
            // find the m-th node as pre
            while (cur != null && i-- > 0) {
                pre = cur;
                cur = cur.next;
            }
            
            while (cur != null && j-- > 0) {
                cur = cur.next;
            }
            pre.next = cur;     // delete n nodes
            
        }
        return head;
    }
}