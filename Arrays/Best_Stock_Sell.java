package Arrays;


/*
 * Best Time to Buy and Sell Stock - LeetCode 121
You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example:

Input: prices = [7, 1, 5, 3, 6, 4] 
Output: 5 
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 */
public class Best_Stock_Sell {

    public static void main(String[] args) {
        int arr[]={7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));

        
    }


    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,max=0,index=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
            min=prices[i];
            index=i;}
        }
      
         for(int i=index+1;i<prices.length;i++){
            if(prices[i]>max)
            max=prices[i];
        }
    
        return max-min;
    }
}


