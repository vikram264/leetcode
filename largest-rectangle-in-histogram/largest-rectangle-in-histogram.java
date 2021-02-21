class Solution {
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        Stack<Integer> stack = new Stack<>();
        
        int max = 0;
        
        
        for(int i = 0;i<=len;i++) {
            int h = (i==len) ? 0:heights[i];
            
            if(stack.isEmpty() || h>=heights[stack.peek()]) {
                stack.push(i);
            } else {
                int tp = stack.pop();
                max  = Math.max(max, heights[tp] * (stack.isEmpty()?i:i-1-stack.peek()));
                i--;
            }
        }
        
        return max;
        
    }
}