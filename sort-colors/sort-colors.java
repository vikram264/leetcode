class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        
        
        
        while(mid<=high) {
            
            if(nums[mid] == 0) {
                
                swap(nums,mid,low);
                mid++;
                low++;
            } else if(nums[mid] == 1) {
                mid++;
            } else if(nums[mid]==2) {
                swap(nums,mid,high);
                high--;
            }
    
        }
    }
    
    
    
    public void swap(int nums[],int a, int b) {
        int c = nums[a];
        nums[a] = nums[b];
        nums[b] = c;
    }
    
    
    
    
    
    
    public void seggregate0And1(int nums[]) {
        
        int start = 0;
        int end = nums.length - 1;
        
        while(start<=end) {
            
            
            while(start<=end && nums[start]==0) {
                start++;
            }
            
            
             while(start<=end && nums[end]==1) {
                end--;
            }
            
            
            if(start<end) {
                
                nums[start] = 0;
                nums[end] = 1;
                start++;
                end--;
                
            }
        }
  
    }
    
    
    
    public void seggregatePositiveAndNegative(int [] nums) {
        
        
        int pivot = 0;
        
        
        for(int i = 0;i<nums.length;i++) {
            
            if(nums[i]<0) {
                swap(nums,pivot,i);
                pivot++;
            }
        }

        
    }
    
    
    
    public  void seggregatePosAndNegOrderMaintain(int [] nums) {
    
    int negatives = 0;
    for(int i : nums) {
        if(i<0) {
           negatives++; 
        }
    }
    
    
    int  i = 0, j = i + 1;
    
    
    while(i!=negatives) {
        
        
        if(nums[i]<0) {
            i++;
            j = i +1;
        } else if(nums[i]>0 && j < nums.length) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
        
    }
      
    
}
}