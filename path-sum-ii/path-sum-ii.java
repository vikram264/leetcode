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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> pathSum = new ArrayList<>();
        
        if(root == null ) return pathSum;
        
        Stack<Triplet> stack = new Stack<>();
        stack.push(new Triplet(root,sum,new ArrayList<>()));
        
        
        while(!stack.isEmpty()) {
            
            Triplet triplet = stack.pop();
            TreeNode node = triplet.node;
            List<Integer> path = triplet.paths;
            int sumValue = triplet.sum;
            
            
            if(node!=null) {
                path.add(node.val);
                
                if(node.left == null && node.right == null && sumValue == node.val) {
                    pathSum.add(path);
                    continue;
                }
                
                if(node.left!=null) {
                    stack.push(new Triplet(node.left,sumValue - node.val,new ArrayList<>(path)));
                }
                
                if(node.right!=null) {
                    stack.push(new Triplet(node.right,sumValue - node.val,new ArrayList<>(path)));
                }
             }
        }
        
       return pathSum; 
    }
    

}

class Triplet {
    
    List<Integer> paths;
    int sum;
    TreeNode node;
    
    
    Triplet(TreeNode node, int sum, List<Integer> paths) {
        this.node = node;
        this.sum = sum;
        this.paths = paths;
        
   }
}
    
    
