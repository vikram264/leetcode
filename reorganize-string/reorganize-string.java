class Solution {
    public String reorganizeString(String S) {
        Map<Character,Integer> charCount = new HashMap<>();
        
        for(char c: S.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c,0) + 1);
        }
        
        PriorityQueue<Character> maxHeap = new PriorityQueue((a,b) -> charCount.get(b) - charCount.get(a));
        maxHeap.addAll(charCount.keySet());
        
        StringBuilder sb = new StringBuilder();
        
        while(maxHeap.size()>1) {
            char current = maxHeap.poll();
            char next = maxHeap.poll();
            sb.append(current).append(next);
            charCount.put(current, charCount.get(current) - 1);
            charCount.put(next, charCount.get(next) - 1);
            
            
            if(charCount.get(current)>0) {
                maxHeap.add(current);
            }
            
            if(charCount.get(next)>0) {
                maxHeap.add(next);
            }
            
            
        }
        
        
        if(!maxHeap.isEmpty()) {
            
           char last = maxHeap.poll();
            if(charCount.get(last)>1)  {
                return "";
            }
            
            sb.append(last);
        }
        
        
        return sb.toString();
        
    }
}