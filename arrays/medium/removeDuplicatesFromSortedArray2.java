package arrays.medium;

class Solution{
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n; // If the array has at most 2 elements, it's already valid.

        int index = 2; // Pointer for the position where the next valid element will be placed.

        // Start iterating from the third element.
        for (int i = 2; i < n; i++) {
            // If the current element is different from the element two positions before,
            // it means it can appear in the result array.
            if (nums[i] != nums[index - 2]) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index; // The length of the modified array with valid elements.
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = solution.removeDuplicates(nums1);
        System.out.println("Output: " + k1 + ", nums = " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums1, k1)));
        // Output: 5, nums = [1, 1, 2, 2, 3]

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int k2 = solution.removeDuplicates(nums2);
        System.out.println("Output: " + k2 + ", nums = " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums2, k2)));
        // Output: 7, nums = [0, 0, 1, 1, 2, 3, 3]
    }
}
