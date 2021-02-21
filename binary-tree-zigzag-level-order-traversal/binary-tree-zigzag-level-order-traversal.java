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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        
        Deque<TreeNode>  dq = new LinkedList<>();
        dq.addFirst(root);
        boolean isEven = true;
        
        while(!dq.isEmpty()) {
            
            //E F L
             int size = dq.size();
             List<Integer> list = new ArrayList<>();
            for(int i = 0;i<size;i++) {
               if(isEven) {
                TreeNode current  = dq.removeFirst();
                list.add(current.val);
                if(current.left!=null) dq.addLast(current.left);
                if(current.right!=null) dq.addLast(current.right);
            
            } else {
                TreeNode current  = dq.removeLast();
                list.add(current.val);
                if(current.right!=null) dq.addFirst(current.right);
                if(current.left!=null) dq.addFirst(current.left);
               
            } 
            }
            
            
            isEven = !isEven;
            result.add(list);
        }
        
        return result;
            
    }
}