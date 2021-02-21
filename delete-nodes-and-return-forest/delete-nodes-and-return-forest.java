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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<TreeNode> resultSet = new HashSet<>();
        resultSet.add(root);
        
        Set<Integer> toDeleteSet = new HashSet<>();
        for(int i : to_delete) {
            toDeleteSet.add(i);
        }
        
        TreeNode dummy = new TreeNode(-1);
        dummy.left = root;
        
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(dummy);
        while(!toDeleteSet.isEmpty()) {
            TreeNode node = queue.poll();
            process(queue,node,node.left,resultSet,toDeleteSet,0);
            process(queue,node,node.right,resultSet,toDeleteSet,1);
 
        }
        
        
        return new ArrayList<>(resultSet);
    }
    
    public void process(Queue<TreeNode> queue,TreeNode parent, TreeNode child,Set<TreeNode> resultSet, Set<Integer> toDeleteSet, int leftOrRight) {
        
        if(child == null) return;
        
        
        if(toDeleteSet.remove(child.val)) {
            resultSet.remove(child);
            
            
            if(child.left!=null) {
                resultSet.add(child.left);
            } 
            
            
            if(child.right!=null) {
                resultSet.add(child.right);
            } 
            
            
            if(leftOrRight == 0) {
                parent.left = null;
            } else {
                parent.right = null;
            }
            
            
        }
        
        queue.offer(child);
        
    }
    
    
}