class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        
        if(n == Integer.MIN_VALUE) {
            x = x * x;
            n = n/2;
        }
        
        if(n<0) {
            n = -n;
            x = 1/x;
        }
        
        
        
        return (n%2==0) ? myPow(x*x, n/2) : x * myPow(x*x, n/2);
    }
    
    
    public List<String> pickRandomItems(List<String> elements, int number) {
        
        List<String> output = new ArrayList<>();  
        
        for(int i = 0;i<number;i++) {
            
            int k = new Random().nextInt(elements.size());
            String element = elements.get(k);
            output.add(element);
            elements.remove(k);          
            
        }
        return output;

        
    }
}