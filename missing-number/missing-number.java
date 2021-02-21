class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i : nums) {
            sum = sum + i;
        }
        
        int n = nums.length;
        
        int rangeSum = n * (n+1) / 2;
        
        return rangeSum - sum;
    }
}