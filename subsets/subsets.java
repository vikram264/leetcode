class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        
        dfs(subsets,new ArrayList<>(),nums,0);
        return subsets;
    }
    
    
    
    public void dfs(List<List<Integer>> subsets,List<Integer> current, int[] nums, int index) {
        
        subsets.add(new ArrayList<>(current));
        
        for(int i = index;i<nums.length;i++) {
            current.add(nums[i]);
            
            dfs(subsets,current,nums,i+1);
            
            
            current.remove(current.size()-1);
        }
        
        
        
    }
}