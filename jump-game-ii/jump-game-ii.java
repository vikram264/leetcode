class Solution {
    public int jump(int[] nums) {
        int jumps = 1;
        int stairs = nums[0];
        int ladders = nums[0];
        
        
        for(int i = 1;i<nums.length;i++) {
            if(i==nums.length-1) return jumps;
            ladders = Math.max(ladders, i + nums[i]);
            stairs --;
            
            if(stairs==0) {
                jumps++;
                stairs = ladders - i;
            }
        }
        
        return 0;
    }
}