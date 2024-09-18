public class L0003MaxProfit{
    public static void main(String [] args){
       int[] prices = {7,1,5,4,6,3};
       System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int lowPrice = prices[0];
        int prevDiff = 0;
        int currDiff = 0;
        for (int price : prices) {
            if (lowPrice > price) {
                lowPrice = price;
            }
        }
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++){
                if(prices[i] < prices[j]){
                    currDiff = prices[j] - prices[i];
                }
                if(currDiff > prevDiff){
                    prevDiff = currDiff;
                }
            }
            if(prices[i] == lowPrice){
                return prevDiff;
            }
        }

    return prevDiff;
    }
}