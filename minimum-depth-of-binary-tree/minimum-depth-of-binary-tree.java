/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
       if(root == null) return 0;
       
       Stack<TreeNode> treeStack = new Stack<>();
       Stack<Integer> levelStack  = new Stack<>();
       treeStack.push(root);
       levelStack.push(1);
        
       int minVal = Integer.MAX_VALUE;
        
        
        while(!treeStack.isEmpty()) {
            
            TreeNode current = treeStack.pop();
            int level = levelStack.pop();
            
            if(current.left == null && current.right == null) {            
                minVal = Math.min(level,minVal);    
            }
            
            
           if(current.left!=null) {
               treeStack.push(current.left);
               levelStack.push(level+1);
           } 
            
          if(current.right!=null) {
               treeStack.push(current.right);
               levelStack.push(level+1);
           }   

        }
      
        
      return minVal;     
           
           
    }
}