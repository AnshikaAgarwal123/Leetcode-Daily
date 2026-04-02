//121. Best Time to Buy and Sell Stock
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

import java.util.*;
public class Best_time_to_buy_and_sell_stock {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]= new int[n];
        for(int i=0; i<prices.length; i++){
            prices[i]= sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min= prices[i];
            }
            else{
                if(prices[i]-min>maxprofit)
                maxprofit= prices[i]-min;
            }
        }
        System.out.println(maxprofit);
    }
}

