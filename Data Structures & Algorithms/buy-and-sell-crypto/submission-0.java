class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1; j<n;j++){
                if(prices[j]-prices[i]<0)continue;
                else if(prices[j]-prices[i]>max){
                    max=prices[j]-prices[i];
                }
            }
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}
