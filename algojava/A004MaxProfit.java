public class A004MaxProfit {
    public static int maxProfit(int[] prices) {
        int smallNum = prices[0];
        int maxP = 0;
        for (int i = 1; i < prices.length; i++) {
            if (smallNum > prices[i]){
                smallNum = prices[i];
            } else {
                int diff = prices[i] - smallNum;
                if (maxP < diff) {
                    maxP = diff;
                }
            }
        }

        return maxP;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println("The max profit to sell -> " + maxProfit(prices1));
        System.out.println("The max profit to sell -> " + maxProfit(prices2));
    }
}
