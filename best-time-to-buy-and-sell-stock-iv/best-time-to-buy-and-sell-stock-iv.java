// We can only make at most len/2 transactions
class Solution {
    public int maxProfit(int k, int[] prices) {
        if (k >= prices.length / 2) { // if k >= n/2, then you can make maximum number of transactions
            int profit = 0;
            for (int i = 1; i < prices.length; i++)
                if (prices[i] > prices[i - 1]) profit =  profit + prices[i] - prices[i - 1];
            return profit;
        }
        int[] buy = new int[k + 1], sell = new int[k + 1];
        Arrays.fill(buy, Integer.MIN_VALUE);
        for (int price : prices) {
            for (int i = 1; i <= k; i++) {
                //previous transaction was completed at sell[i-1], so sell[i-1] will be our balance
                // thus we have to subtract current price
                buy[i] = Math.max(buy[i], sell[i - 1] - price);
                
                // by the time we come here, we already have bough the stock , so we just sell it and add the current price
                sell[i] = Math.max(sell[i], buy[i] + price);
            }
        }
        return sell[k];
    }
    
}