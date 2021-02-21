class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if(numRows == 0) return triangle;
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        for(int i = 1;i<numRows;i++) {
            List<Integer> prev = triangle.get(i-1);
            
            List<Integer> current = new ArrayList<>();
            current.add(1);
            
            for(int x = 1;x<prev.size();x++) {
                int sum = prev.get(x) + prev.get(x-1);
                current.add(sum);
            }
            
            current.add(1);
            
            triangle.add(current);
        }
        return triangle;
    }
}