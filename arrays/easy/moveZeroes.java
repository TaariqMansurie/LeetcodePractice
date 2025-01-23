package arrays.easy;

class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Pointer to track the position for the next non-zero element

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap non-zero element with the position at nonZeroIndex
                int temp = nums[i];
                nums[i] = nums[nonZeroIndex];
                nums[nonZeroIndex] = temp;

                // Move the nonZeroIndex forward
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println("Output: " + java.util.Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

        // Example 2
        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println("Output: " + java.util.Arrays.toString(nums2)); // Output: [0]
    }
}

