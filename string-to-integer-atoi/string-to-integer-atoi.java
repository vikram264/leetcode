class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        
        while(i<n && s.charAt(i)==' ') i++;
        if(i>=n) return 0;
        
        int sign = 1;
        if(s.charAt(i)=='+' || s.charAt(i)=='-') {
            sign = s.charAt(i)=='+' ? 1:-1;
            i++;
        }
        
        long result=0;
        while(i<n && Character.isDigit(s.charAt(i))) {
            result  = result * 10 + (s.charAt(i)-'0');
            i++;
            
            if(result * sign>Integer.MAX_VALUE || result * sign < Integer.MIN_VALUE) {
                return sign == 1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            
        }
        
        return (int) (sign * result);
    }
}