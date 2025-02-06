package arrays.medium;

class Solution {
    public int maxArea(int[] height) {
        int left = 0;                       // Left pointer at the start
        int right = height.length - 1;      // Right pointer at the end
        int maxArea = 0;                    // Variable to track the maximum area

        while (left < right) {
            // Calculate the current area
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = width * minHeight;

            // Update maximum area if current area is greater
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer corresponding to the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max Area: " + solution.maxArea(height1)); // Output: 49
        
        int[] height2 = {1, 1};
        System.out.println("Max Area: " + solution.maxArea(height2)); // Output: 1
    }
}
