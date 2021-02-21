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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        
        Queue<HDNode> queue = new LinkedList<>();
        queue.offer(new HDNode(root,0));
        
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        
        while(!queue.isEmpty()) {
            HDNode hdNode = queue.poll();
            TreeNode treeNode = hdNode.treeNode;
            int hd = hdNode.hd;
            
            map.putIfAbsent(hd,new ArrayList<>());
            map.get(hd).add(treeNode.val);
            
            if(treeNode.left!=null) queue.offer(new HDNode(treeNode.left,hd-1));
            if(treeNode.right!=null) queue.offer(new HDNode(treeNode.right,hd+1));
        }
        
        
        for(Integer key:map.keySet()) {
            list.add(map.get(key));
        }
        return list;
    }
}

class HDNode {
    
    TreeNode treeNode;
    int hd;
    
    HDNode(TreeNode treeNode, int hd) {
        this.treeNode = treeNode;
        this.hd = hd;
    }
}