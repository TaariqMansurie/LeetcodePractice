package arrays.medium;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE; // To store the minimal length
        int left = 0; // Left pointer of the sliding window
        int sum = 0; // Current sum of the sliding window

        // Iterate over the array with the right pointer
        for (int right = 0; right < n; right++) {
            sum += nums[right]; // Add the current element to the sum

            // Shrink the window while the sum is greater than or equal to target
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1); // Update the minimum length
                sum -= nums[left]; // Remove the leftmost element from the sum
                left++; // Move the left pointer to the right
            }
        }

        // If minLength is not updated, return 0; otherwise, return minLength
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.println("Result: " + solution.minSubArrayLen(7, nums1)); // Output: 2

        int[] nums2 = {1, 4, 4};
        System.out.println("Result: " + solution.minSubArrayLen(4, nums2)); // Output: 1

        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("Result: " + solution.minSubArrayLen(11, nums3)); // Output: 0
    }
}
