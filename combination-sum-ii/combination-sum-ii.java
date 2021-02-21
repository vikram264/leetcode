class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> combinationSum2 = new ArrayList<>();
        
        Arrays.sort(candidates);
        
        dfs(candidates,target,combinationSum2,new ArrayList<>(),0);
        
        return combinationSum2;
        
    }
    
    
    public void dfs(int[] candidates, int target,List<List<Integer>> combinationSum2,List<Integer> current,int index) {
        
        if(target<0) {
            return;
        } else if(target == 0) {
            combinationSum2.add(new ArrayList<>(current));
        }
        
        for(int i = index;i<candidates.length;i++) {
            
            if(i>index && candidates[i]==candidates[i-1]) continue;
            current.add(candidates[i]);
        
            dfs(candidates, target-candidates[i],combinationSum2,current,i+1);
            current.remove(current.size()-1);
                
                
                
        }
        
        
        
        
    }
}