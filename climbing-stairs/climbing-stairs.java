class Solution {
    public int climbStairs(int n) {
        int dp [] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2;i<=n;i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    
    //https://www.geeksforgeeks.org/count-ofdifferent-ways-express-n-sum-1-3-4/
    public  int countWays(int n) {
        int dp[] = new int[n+1];
        dp[0] = dp[1] = dp[2] = 1;
        dp[3] = 2;
        
        for(int i = 4;i<=n;i++) {
            dp[i] = dp[i-1] + dp[i-3] + dp[i-4];
        }
        
        return dp[n];
        
        
    }
    
    
public int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
    
    
    
    
    public int calculate(int number) {
        if(number == 0) return 1;
        else {
            System.out.println("******Calculating Factorial for " + number);
            return number*calculate(number-1);
        }
    }
     List<Integer> cache = new ArrayList<>();
    public int memoizefact(int number) {

        if(number == 0) return 1;
        else {
            if(cache.size()>=number) {
                System.out.println("Retrive from cache "+number);
                return cache.get(number-1);
            }
            System.out.println("Calculating fact for " + number);
            int factorial = number * memoizefact(number-1);
            System.out.println("***** Adding to cache =  " + factorial);
            cache.add(factorial);
            return  factorial;
        }
    }
    
    
   
}