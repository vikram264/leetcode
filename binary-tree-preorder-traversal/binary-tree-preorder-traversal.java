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
//Root-left-right
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer>  result = new ArrayList<>();
        if(root == null) return result;
        TreeNode current = root;
        
        Stack<TreeNode> stack = new Stack<>();
        
        while(!stack.isEmpty() || current!=null) {
            
            while(current!=null) {
                stack.push(current);
                result.add(current.val);
                current = current.left;
            }
            current = stack.pop();
            current = current.right;
        }
        
        return result;
    }
}