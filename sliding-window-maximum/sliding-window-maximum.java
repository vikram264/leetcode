class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0) return nums;
        if(k>nums.length) return new int[0];
        
        Deque<Integer> dq = new ArrayDeque<>();
        int len =  nums.length;
        int [] result =  new int[len - k +1];
        
        for(int i = 0;i<len;i++) {
            
            if(!dq.isEmpty() && i-k+1 > dq.peekFirst()) {
                dq.poll();
            }
            
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]) {
                dq.pollLast();
            }
            
            dq.addLast(i);
            
            if(i-k+1>=0) {
                result[i-k+1] = nums[dq.peek()];
            }
            
            
        }
        return result;
    } 
  
}
//current number is greater than the top of the queue. Remove the all the elements that are lesser than the current element and place this value.

//nums = [1,3,-1,-3,5,3,6,7], and k = 3
//                    w   i  
//deque : 7
//res:3,3,5,5,6,7