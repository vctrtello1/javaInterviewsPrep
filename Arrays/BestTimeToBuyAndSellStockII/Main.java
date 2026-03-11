package Arrays.BestTimeToBuyAndSellStockII;

public class Main {
     public static void main(String[] args) {
          Main main = new Main();
          int[] prices = {7, 1, 5, 3, 6, 4};
          int result = main.maxProfit(prices);
          System.out.println(result); // Output: 7
     }
    
     public int maxProfit(int[] prices) {
         int maxprofit = 0;
         for (int i = 1; i < prices.length; i++) {
             if (prices[i] > prices[i - 1])
                 maxprofit += prices[i] - prices[i - 1];
         }
         return maxprofit;
     }    
}
