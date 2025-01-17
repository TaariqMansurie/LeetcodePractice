package arrays.easy;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }

        // If target is not found, 'left' is the insertion position
        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 3, 5, 6};
        System.out.println("Output: " + solution.searchInsert(nums1, 5)); // Output: 2

        int[] nums2 = {1, 3, 5, 6};
        System.out.println("Output: " + solution.searchInsert(nums2, 2)); // Output: 1

        int[] nums3 = {1, 3, 5, 6};
        System.out.println("Output: " + solution.searchInsert(nums3, 7)); // Output: 4
    }
}
