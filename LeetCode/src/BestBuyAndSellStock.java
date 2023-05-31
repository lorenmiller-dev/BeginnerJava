public class BestBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        // cannot sell stock before buying

        // initialize variables
        int min_value = Integer.MAX_VALUE;
        int max_profit = 0;

        // loop through array
        for (int i = 0; i < prices.length; i++){
            // if prices on ith day less than min value
            if (prices[i] < min_value){
                // update min_value with lower prices value
                min_value = prices[i];

                // check if new profit calculated from prices - min value is greater than max profit
            } else if (prices[i] - min_value > max_profit) {
                // set max profit to new value
                max_profit = prices[i] - min_value;
            }
        }
        // return highest profit
        return max_profit;
    }
}
