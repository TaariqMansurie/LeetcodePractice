package arrays.medium;

class Solution {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        // Iterate through the prices array
        for (int i = 1; i < prices.length; i++) {
            // If the price on day i is greater than day i-1, add the profit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices1[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices1)); // Output: 7

        int prices2[] = {1, 2, 3, 4, 5};
        System.out.println("Maximum Profit: " + maxProfit(prices2)); // Output: 4

        int prices3[] = {7, 6, 4, 3, 1};
        System.out.println("Maximum Profit: " + maxProfit(prices3)); // Output: 0
    }
}