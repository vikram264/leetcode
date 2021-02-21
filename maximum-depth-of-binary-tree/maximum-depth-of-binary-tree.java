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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> levelStack = new Stack<>();
        stack.push(root);
        levelStack.push(1);
        
        int max = 0;
        while(!stack.isEmpty()) {
            TreeNode current =  stack.pop();
            int level = levelStack.pop();
            
            if(current.left == null && current.right == null) {
                max = Math.max(max, level);
            }
            
            if(current.left!=null) {
                levelStack.push(level+1);
                stack.push(current.left);
            } 
            
            if(current.right!=null) {
                levelStack.push(level+1);
                stack.push(current.right);
            } 
        
        }
        
        return max;
    }
}