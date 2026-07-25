package leetcode;

public class LC122_BestTimeToBuySellStock2 {
    public static void main(String[] args) {
        int[]prices = {7,1,5,3,6,4};
        int totalProfit =0;
        for (int i =1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){//todays prices is greater then yesterdays proice
                totalProfit+=prices[i]-prices[i-1];//profit = today-yesterday
            }
        }
        System.out.println("total profit :" + totalProfit);

    }
}
