package Arrays.BestTimeToBuyAndSellStock;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = main.maxProfit(prices);
        System.out.println(result); // Output: 5
    }

    public int maxProfit(int[] prices) {
        // if the given array is empty return 0
        if (prices.length == 0)
            return 0;
        // initialize maxProfit to 0
        int maxProfit = 0;
        // we are storing the buying price & keep it smaller
        int buyAt = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - buyAt);
            // if buy price greater than current price, then set buyAt = currentPrice
            if (buyAt > prices[i]) {
                buyAt = prices[i];
            }
        }
        return maxProfit;
    }
    
}
