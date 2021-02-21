class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        Map<Integer, List<Integer>> map = new HashMap<>();
       
        for(int[] pre: prerequisites) {
            indegrees[pre[0]]++;
            if(!map.containsKey(pre[1])) map.put(pre[1], new ArrayList<>());
            map.get(pre[1]).add(pre[0]);
        }
      
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<indegrees.length; i++) {
            if(indegrees[i] == 0) q.offer(i);
        }
        int total = 0;
       
        while(q.size() > 0) {
            int pre = q.poll();
            total++;
            List<Integer> cs = map.get(pre);
            if(cs == null) continue;
            for(int c: cs) {
              indegrees[c]--;
                if(indegrees[c] == 0) {
                    
                    q.offer(c);
            }
        }
        }

        return total == numCourses;
    }
}