class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0 ||s.isEmpty()) return 0;
        
        int length=0;
        for(int i = s.length()-1;i>=0;i--) {
            
            char c = s.charAt(i);
            if(c==' ') {
                if(length==0) continue;
                return length;
                
            } else {
                length++;
            }
            
            
            
            
            
        }
        
        return length;
    }
}