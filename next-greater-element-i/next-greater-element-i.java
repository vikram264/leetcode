class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0;i<nums2.length;i++) {
            
            while(!stack.isEmpty() && nums2[i]>stack.peek()) {
                map.put(stack.pop(),nums2[i]);
            }
                
           stack.push(nums2[i]);     
                
        }
        
        for(int i=0;i<nums1.length;i++) {
           nums1[i] = map.getOrDefault(nums1[i],-1);
        }
        
        return nums1;
    }
    
    
    public void nextGreatestInArray(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> nextGreatest = new HashMap<>();
        for(Integer num:nums) {

            while(!stack.isEmpty()&& num>stack.peek()) {
               nextGreatest.put(stack.pop(),num);
            }
            stack.push(num);
        }

    for(Integer num:nums) {
            nextGreatest.putIfAbsent(num,0);
            
        }
        System.out.println("Map "+nextGreatest.toString());
    }
}