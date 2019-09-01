public class BuySellStock {
    public static void main(String[] args) {
//        int[] prices = {7,1,5,3,6,4};
        int[] prices = {7,6,4,3,1};
        BuySellStock bss = new BuySellStock();
        int output = bss.maxProfit(prices);
        System.out.println(output);
    }

    int maxProfit(int[] prices) {
        int maxProf = 0;
        int difference = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                 difference = prices[i] - min;
                 maxProf = Math.max(maxProf, difference);
            }
        }
        return maxProf;
    }
}
