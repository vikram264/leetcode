class Solution {
    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        if(len!=t.length()) return false;
        
        char sm[] = new char[256];
        char tm[] = new char[256];
        
        for(int i = 0;i<len;i++) {
            
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            
            if(sm[sc]==0 && tm[tc]==0) {
                sm[sc]=tc;
                tm[tc]=sc;
            } else if(sm[sc]!=tc && tm[tc]!=sc) {
                return false;
            }
            
        }
        
        return true;
    }
}