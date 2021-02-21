class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(candidates,target,list, new ArrayList<>(),0);
        return list;
        
    }
    
    
    
    public void dfs(int [] candidates,int target, List<List<Integer>> list, List<Integer> current, int index) {
        if(target<0) {
            return;
        } else if(target == 0) {
            list.add(new ArrayList<>(current));
        }
        
        
        for(int i = index;i<candidates.length;i++) {
            
            current.add(candidates[i]);       
            
            dfs(candidates,target-candidates[i],list,current,i);
            
            current.remove(current.size()-1);
        }
        
        
    }
}