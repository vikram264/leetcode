/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            TreeNode first = queue.poll();
            TreeNode second = queue.poll();
            
            if(first == null && second == null) continue;
            if(first == null || second == null) return false;
            if(first.val!=second.val) return false;
            
            queue.offer(first.left);
            queue.offer(second.right);
            
            queue.offer(first.right);
            queue.offer(second.left);
            
        }
        
        return true;
        
    }
}