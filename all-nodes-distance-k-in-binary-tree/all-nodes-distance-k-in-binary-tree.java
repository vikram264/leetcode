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
    Map<Integer, List<Integer>> map;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        
        map = new HashMap<>();
        build(root,null);
        
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        queue.add(target.val);
        visited.add(target.val);
        
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            
            if(K == 0) {
                result.addAll(queue);
                return result;
            }
            
            for(int i = 0;i<size;i++) {
                int key = queue.poll();
                List<Integer> list = map.get(key);
                
                for(Integer val : list) {
                    if(!visited.contains(val)) {
                        queue.offer(val);
                        visited.add(val);
                    }
                }
            }
            K--;
        }
        return result;
        
    }
    
    
    public void build(TreeNode root, TreeNode parent) {
        if(root == null) return;
        map.putIfAbsent(root.val, new ArrayList<>());
        
        if(parent!=null) {
            map.get(root.val).add(parent.val);
        }
        
        if(root.left!=null) {
            map.get(root.val).add(root.left.val);
        }
        
        if(root.right!=null) {
            map.get(root.val).add(root.right.val);
        }
        
        build(root.right,root);
        build(root.left,root);
    }
}