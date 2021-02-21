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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        
        List<Integer> currentLevel = new ArrayList<>();
        
        while(!queue.isEmpty()) {
            TreeNode current = queue.poll();
            
            if(current == null) {
                
                int size = currentLevel.size();
                result.add(currentLevel.get(size-1));
                if(queue.isEmpty()) break;
                queue.add(null);
                currentLevel = new ArrayList<>();
                continue;
                
                
            }
            
            
            
            currentLevel.add(current.val);
            
            if(current.left!=null) queue.offer(current.left);
            if(current.right!=null) queue.offer(current.right);
            
            
            
        }
        
        return result;
    }
}