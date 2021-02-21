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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        
        if(root == null) return results;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        
        List<Integer> currentLevel = new ArrayList<>();
        
        while(!queue.isEmpty()) {
            
            TreeNode current = queue.poll();
            if(current == null) {
                results.add(currentLevel);
                if(queue.isEmpty()) {
                    break;
                }
                queue.offer(null);
                currentLevel = new ArrayList<>();
                continue;
      
            }
            
            currentLevel.add(current.val);
            if(current.left!=null) queue.offer(current.left);
            if(current.right!=null) queue.offer(current.right);
            
        }
        
        return results;
    }
}