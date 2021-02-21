class Solution {
    public int findPairs(int[] nums, int k) {
        int res = 0;
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i:nums) {
            
            if(map.containsKey(i)) {
                if(k==0 && map.get(i)==1) res++;
                
                map.put(i, map.get(i)+1);
            } else {
               
                if(map.containsKey(i-k)) res++;
                if(map.containsKey(i+k)) res++;
                
                map.put(i,1);
            }
            
            
        }
       return res; 
    }
}