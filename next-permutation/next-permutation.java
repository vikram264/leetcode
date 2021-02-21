class Solution {
    public void nextPermutation(int[] nums) {
       int k = nums.length - 2;
        while(k>=0 && nums[k]>=nums[k+1]) k--;
        if(k==-1) {  
            reverse(0,nums.length-1,nums);
            return;
        }
        
        for(int i = nums.length - 1;i>=0;i--) {
            
            if(nums[i]>nums[k]) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                break;
            }
        }
        
        reverse(k+1,nums.length-1,nums);
    }
    
    
    public void reverse(int i, int j,int [] nums) {
        
        
        while(i<j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}