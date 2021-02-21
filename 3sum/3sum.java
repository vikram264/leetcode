class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0) return result;
        Arrays.sort(nums);
        
        
        for(int i = 0;i<nums.length-2;i++) {
            
            
            if(i==0 || (i>0 && nums[i]!=nums[i-1])) {
                
                int low = i + 1;
                int high = nums.length - 1;
                
                while(low<high) {
                    
                    if(nums[i]+nums[low]+nums[high] == 0) {
                        result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        
                        while(low<high && nums[low] == nums[low+1]) low++;
                        while(low<high && nums[high] == nums[high-1]) high--;
                        low++;
                        high--;
                            
                    } else if(nums[i]+nums[low]+nums[high]> 0) {
                        high --;
                    } else {
                        low ++;
                    }
                         
                    
                }
                
                
                
            }
        }
        
        return result;
    }
}