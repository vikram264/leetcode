class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int n : nums) {
            set.add(n);
        }
        
        
        int max = 0;
        
        for(int i = 0;i<nums.length;i++) {
            
            
            int count = 1;
            int num = nums[i];
            
            while(set.contains(num - 1)) {
                num --;
                count++;
                set.remove(num);
            }
            
            num = nums[i];
            while(set.contains(num + 1)) {
                num ++;
                count++;
                set.remove(num);
            }
            max = Math.max(max,count);
        }
        
        return max;
    }
}