class Solution {
    public int maxSubArray(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSofar = nums[0];
        
        
        for(int i = 1;i<nums.length;i++) {
            maxEndingHere = Math.max(nums[i], nums[i] + maxEndingHere);
           
            maxSofar = Math.max(maxEndingHere,maxSofar);  
             
        }
        
        return maxSofar;
    }
   
    
    public int maxSubArray2(int[] nums) {
            int maxSoFar = nums[0];
            int maxEndingHere = 0;
            int start = 0,end = 0, s=0;
            for(int i = 0;i<nums.length;i++) {
                maxEndingHere = maxEndingHere+ nums[i];
                if(maxEndingHere>maxSoFar) {
                    maxSoFar = maxEndingHere;

                     start = s; // start from s as previous array is disregarded and s is at i+1

                     end = i; // end is current index;

                }
                if(maxEndingHere <0) {
                    maxEndingHere = 0;
                    //As the maxEndhere is 0. we can disregard the array till here
                    // and max sub array can start from next element
                    s = i+1;
                }
            }

            System.out.println(" start " +start + " end " + end);
            return maxSoFar;
        }
    
   
}