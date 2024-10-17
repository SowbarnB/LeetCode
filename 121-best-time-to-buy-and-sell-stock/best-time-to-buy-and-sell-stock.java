class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;

        int costPrice = prices[0];
        int profit = 0;

        for(int i = 1; i < n; i++)
        {
            int sellingPrice = prices[i];
            if(sellingPrice < costPrice)
            {
                costPrice = sellingPrice;
            }

            profit = Math.max(profit, sellingPrice - costPrice); 

        }
        return profit;
    }
}
//timecomplexity: O(n)
//spacecomplexity: O(1)