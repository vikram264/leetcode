class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int totalSum = 0;
        for(int card : cardPoints) {
            totalSum = card + totalSum;
        
        }
        
        int n = cardPoints.length;
        if(n == k) return totalSum;
        
        
        int windowSize = n - k;
        
        int score = 0;
        for(int i = 0;i<windowSize;i++) {
            score = cardPoints[i] + score;
        }
        
        int max = totalSum - score;
        
        for(int i = 0;i<k;i++) {
            score = score - cardPoints[i]+ cardPoints[i+windowSize];
            max = Math.max(max, totalSum - score);
        }
        return max;
    }
    
}