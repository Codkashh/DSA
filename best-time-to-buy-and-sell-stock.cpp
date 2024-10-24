class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int min = prices[0];
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            } else if(prices[i]-min>sum){
                sum = prices[i] - min;
            }
        }
        return sum;
    }
}