import java.util.HashMap;

public class BuyAndSellStock {
    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day
    to buy one stock and choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction.
    If you cannot achieve any profit, return 0.
     */
    public int maxProfit(int[] prices) {
        //if the prices array is empty, return 0
        if(prices.length == 0) {
            return 0;
        }

        //set min value as something not null, all possible values will be less than max value
        int min = Integer.MAX_VALUE;
        //init overallProfit and ProfitIfSoldToday
        int overallProfit = 0;
        int profitIfSoldToday = 0;
        for (int price : prices) {
            //if the current price is less than the min, set new min
            if (price < min) {
                min = price;
            }
            //calculate profit if sold today
            profitIfSoldToday = price - min;

            //if the overall profit is less than the profit if sold today
            // set new overall profit
            if (overallProfit < profitIfSoldToday) {
                overallProfit = profitIfSoldToday;
            }
        }
        //return overall profit
        return overallProfit;


    }
}
