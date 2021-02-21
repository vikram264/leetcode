class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        
        int left [] = new int[len];
        
        left[0] = 1;
        
        
        for(int i = 1;i<len;i++) {
            left[i] = nums[i-1] * left[i-1];
        }
        
        int r = 1;
        for(int i = len-1;i>=0;i--) {
             left[i] = left[i] * r;
             r = r * nums[i];
        }
        
        
        
        return left;
    
        }
}


// int len = nums.length;
        
//         int left [] = new int[len];
//         int right [] = new int[len];
//         int output [] = new int[len];
        
//         left[0] = 1;
//         right[len-1] = 1;
        
//         for(int i = 1;i<len;i++) {
//             left[i] = nums[i-1] * left[i-1];
//         }
        
        
//         for(int i = len-2;i>=0;i--) {
//             right[i] = nums[i+1] * right[i+1];
//         }
        
//         for(int i = 0;i<len;i++) {
//             output[i] = left[i] * right[i];
//         }
        
//         return output;
    