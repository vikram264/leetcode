class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> subsetsWithDup = new ArrayList<>();
        
        Arrays.sort(nums);
        
        dfs(subsetsWithDup,new ArrayList<>(),nums,0);
        
        return subsetsWithDup;
        
    }
    
    
    public void dfs(List<List<Integer>> subsetsWithDup,List<Integer> current,int[] nums,int index) {
        subsetsWithDup.add(new ArrayList<>(current));
        
        
        for(int i = index;i<nums.length;i++) {
            if(i>index && nums[i]== nums[i-1]) continue;
            
            current.add(nums[i]);
            
            dfs(subsetsWithDup,current,nums,i+1);
            
            current.remove(current.size()-1);
        }
    }
}