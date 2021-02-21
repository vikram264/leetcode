class Solution {
    public int minMeetingRooms(int[][] intervals) {
        List<Interval> list = new ArrayList<>();
        for(int [] interval : intervals) {
            list.add(new Interval(interval[0],interval[1]));
  
        }
        
        
        list.sort(new Comparator<Interval> () {
            
            @Override
            public int compare(Interval i1, Interval i2) {
                if(i1.start == i2.start) return 0;
                return i1.start - i2.start;
            }
        });
        
        Queue<Integer> pq = new PriorityQueue<>();
        
        for(Interval i :list) {
            
            
           if(!pq.isEmpty() && i.start>=pq.peek()) {
               pq.poll();
           } 
      
            pq.offer(i.end);
        }
        
        return pq.size();
        
    }
}



class Interval {
    
    int start;
    int end;
    
    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
}