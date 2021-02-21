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
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if(root == null) return results;
        
        results.add(root.val);
        
        left(root.left, results);
        leaves(root.left, results);
        leaves(root.right, results);
        right(root.right, results);
        return results;         
    }
    
    
    public void left(TreeNode node,List<Integer> result ) {   
        if(node == null || (node.left == null && node.right == null)) return;
        result.add(node.val);
        if(node.left == null) left(node.right, result);
        else left(node.left, result);
    }
    
    public void right(TreeNode node,List<Integer> result ) {   
        if(node == null || (node.left == null && node.right == null)) return; 
        if(node.right == null) right(node.left, result);
        else right(node.right, result);
        result.add(node.val);
    }
    
    
    public void leaves(TreeNode node,List<Integer> result ) {   
        if(node == null) return; 
        if(node.left == null && node.right == null) {
           result.add(node.val);
           return;
       }
        leaves(node.left,result);
        leaves(node.right,result);
        
    }
}