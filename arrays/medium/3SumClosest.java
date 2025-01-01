package arrays.medium;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array
        int closestSum = nums[0] + nums[1] + nums[2]; // Initialize with the first three elements

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                // Update closest sum if the current one is closer to the target
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++; // Move left pointer to increase the sum
                } else if (currentSum > target) {
                    right--; // Move right pointer to decrease the sum
                } else {
                    // If the sum equals the target, it's the closest possible sum
                    return currentSum;
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {-1, 2, 1, -4};
        System.out.println("Output: " + solution.threeSumClosest(nums1, 1)); // Output: 2

        int[] nums2 = {0, 0, 0};
        System.out.println("Output: " + solution.threeSumClosest(nums2, 1)); // Output: 0
    }
}