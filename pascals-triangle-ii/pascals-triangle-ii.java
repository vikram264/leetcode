class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) return Arrays.asList(1);
        
        List<Integer> prev = Arrays.asList(1,1);
        if(rowIndex == 1) return prev;
        
        for(int i =1 ;i<rowIndex;i++) {
            
            List<Integer> current  = new ArrayList<>();
            current.add(1);
            for(int x = 1 ;x<prev.size();x++) {
                int sum = prev.get(x) + prev.get(x-1);
                current.add(sum);
            }
            
            current.add(1);
            
            if(i+1 == rowIndex) return current;
            else prev = current;
        }
        return new ArrayList<>();
    }
}