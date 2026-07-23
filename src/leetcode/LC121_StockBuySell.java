package leetcode;

public class LC121_StockBuySell {
    public static void main(String[] args) {

        int[] prices = {3, 8, 2, 5};

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {//checks if the current price is smaller than the cheapest price found so far
                minPrice = prices[i];//stores the current price as the new cheapest buying price
            } else if (prices[i] - minPrice > maxProfit) {//sp - cheapest buying price
                maxProfit = prices[i] - minPrice;//stores larger profit
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }
}