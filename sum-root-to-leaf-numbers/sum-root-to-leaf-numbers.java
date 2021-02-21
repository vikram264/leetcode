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
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        
        Stack<Pair<TreeNode, Integer>> stack  = new Stack<>();
        stack.push(new Pair(root,0));
        int sum = 0;
        
        while(!stack.isEmpty()) {
            
            Pair<TreeNode, Integer> pair = stack.pop();
            TreeNode current = pair.getKey();
            int val = pair.getValue();
            
            if(current!=null) {
                val = val * 10 + current.val;
                if(current.left ==null && current.right==null) {
                    sum = sum + val;
                }
                
                if(current.left!=null) {
                    stack.push(new Pair(current.left,val));
                }
                
                if(current.right!=null) {
                    stack.push(new Pair(current.right,val));
                }
            }
            
            
        }
        
        return sum;
    }
}