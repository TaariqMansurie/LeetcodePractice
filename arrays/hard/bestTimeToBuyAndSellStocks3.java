package arrays.hard;

public class bestTimeToBuyAndSellStocks3 {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length <= 1) return 0;
    
            int n = prices.length;
            int[] leftProfit = new int[n];
            int[] rightProfit = new int[n];
    
            // Step 1: Calculate leftProfit (max profit for one transaction up to each day)
            int minPrice = prices[0];
            for (int i = 1; i < n; i++) {
                minPrice = Math.min(minPrice, prices[i]);
                leftProfit[i] = Math.max(leftProfit[i - 1], prices[i] - minPrice);
            }
    
            // Step 2: Calculate rightProfit (max profit for one transaction from each day to the end)
            int maxPrice = prices[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                maxPrice = Math.max(maxPrice, prices[i]);
                rightProfit[i] = Math.max(rightProfit[i + 1], maxPrice - prices[i]);
            }
    
            // Step 3: Combine leftProfit and rightProfit to calculate the maximum profit
            int maxProfit = 0;
            for (int i = 0; i < n; i++) {
                maxProfit = Math.max(maxProfit, leftProfit[i] + rightProfit[i]);
            }
    
            return maxProfit;
        }
    
        public static void main(String[] args) {
            bestTimeToBuyAndSellStocks3 solution = new bestTimeToBuyAndSellStocks3();
    
            int[] prices1 = {3, 3, 5, 0, 0, 3, 1, 4};
            System.out.println("Maximum Profit: " + solution.maxProfit(prices1)); // Output: 6
    
            int[] prices2 = {1, 2, 3, 4, 5};
            System.out.println("Maximum Profit: " + solution.maxProfit(prices2)); // Output: 4
    
            int[] prices3 = {7, 6, 4, 3, 1};
            System.out.println("Maximum Profit: " + solution.maxProfit(prices3)); // Output: 0
        }
    }
        
