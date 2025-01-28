class Solution {
    public int kthGrammar(int n, int k) {
        // Base case: In the first row, the only symbol is 0
        if (n == 1) {
            return 0;
        }

        // Find the midpoint of the current row (which corresponds to half the size of the previous row)
        int mid = (1 << (n - 2)); // This is 2^(n-2)

        // If k is in the first half, it corresponds to the same position in the previous row
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        }
        // If k is in the second half, it corresponds to the inverted value of the position in the previous row
        else {
            return 1 - kthGrammar(n - 1, k - mid);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1
        System.out.println(solution.kthGrammar(1, 1)); // Output: 0

        // Test Case 2
        System.out.println(solution.kthGrammar(2, 1)); // Output: 0

        // Test Case 3
        System.out.println(solution.kthGrammar(2, 2)); // Output: 1

        // Test Case 4
        System.out.println(solution.kthGrammar(3, 2)); // Output: 1

        // Test Case 5 (For a larger value of n)
        System.out.println(solution.kthGrammar(4, 5)); // Output: 1
    }
}


