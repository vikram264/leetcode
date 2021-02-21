class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0) return 0;
        int result = 0;
        int sum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        
        map.put(0,1);
        
        for(int i = 0;i<nums.length;i++) {
            sum = sum + nums[i];
            if(map.containsKey(sum-k)) {
                result = result + map.get(sum-k);
            }
            
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        
        return result;
    }
    
    
    
    public void subArrayIndex(int nums[], int k) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        
        insertIntoMap(map,0,-1);
        int sum = 0;
        
        
        for(int i = 0;i<nums.length;i++) {
            
            sum = sum + nums[i];
            
            
            if(map.containsKey(sum - k)) {
                
                List<Integer> indices = map.get(sum - k);
                
                for(int value : indices) {
                    for(int j = value + 1;j<=i;j++) {
                        System.out.println(j);
                        System.out.println(nums[j]);
                    }
                }
                
                
            }
            
            insertIntoMap(map,sum,i);
        }
        
        
        
    }
    
    
    public void insertIntoMap(Map<Integer,List<Integer>> map,int sum, int index) {
        
        map.putIfAbsent(sum,new ArrayList<>());
        map.get(sum).add(index);
        
        
        
    }
    
    
   public int[] subArraySum0(int [] arr) {
       
               
       int sum = 0;
       Map<Integer,Integer> map = new HashMap<>();
       
       for(int i = 0;i<=arr.length;i++) {
           
           Integer oldIndex = map.get(sum);
           
           
           if((oldIndex == null) && (i == arr.length)) return new int[]{-1,-1};
            else if(oldIndex == null) {
               map.put(sum,i);
               sum = sum + arr[i];
           } else {
                return Arrays.copyOfRange(arr,oldIndex,i);
            }
           
           
       }
       return null;
       
       
   }
}