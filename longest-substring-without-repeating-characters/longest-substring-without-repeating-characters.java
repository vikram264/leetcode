class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int aPointer = 0;
        int bPointer = 0;
        
        int max = 0;
        String subString = "";
        
        while(bPointer<s.length()) {
            
            char c = s.charAt(bPointer);
            
            if(!set.contains(c)) {
                set.add(c);
                bPointer++;
                max = Math.max(set.size(),max);
            } else {
                set.remove(s.charAt(aPointer));
                aPointer++;
            }
            
            if(subString.length()<bPointer - aPointer) {
                subString = s.substring(aPointer,bPointer);
            }
            
        }
        System.out.println(subString);
        
        return max;
    }
}