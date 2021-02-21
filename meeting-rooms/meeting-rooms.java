class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (arr1,arr2)-> Integer.compare(arr1[0],arr2[0]));
        
        for(int i = 0;i<intervals.length-1;i++) {
            int end1 = intervals[i][1];
            int start2 = intervals[i+1][0];
            
            if(end1>start2) return false;
        }
        return true;
    }
}