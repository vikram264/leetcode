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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
       if(root == null) return output;
        
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        
        while(current!=null || !stack.isEmpty()) {
            
            
            while(current!=null) {
                stack.push(current);
                current = current.left;
            }
            
            current = stack.pop();
            output.add(current.val);
            current = current.right;
        }
        return output;
    }
}