// class Solution {
//     public static int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i<nums.length ; i++){
//             for ( int j = i+1; j<nums.length; j++){
//                 for ( int k = j+1; k<nums.length; k++){
//                     for ( int l = k+1; l<nums.length; l++){
//                         if (nums[i]+ nums[j] + nums[k]+ nums[l] == target){
//                         return new int[] {i,j,k,l};
//                         }
//                     }
//                 }
//             }
//         }
//         return new int[] {} ;
//     }

//     public static void main(String args[]){
//         int nums[] = {1,0,-1,0,-2,2};
//         int target = 0;
//         int[] result = twoSum(nums, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]+ ", " + result[2]+ ", " +result[3]); 
//     }
// }

// TODO: not complete   

// class Solution {
//     public static int[] fourSum(int nums[], int target) {
//         for (int i = 0; i<nums.length ; i++){
//             for ( int j = i+1; j<nums.length; j++){
//                 for ( int k = j+1; k<nums.length; k++){
//                     for ( int l = k+1; l<nums.length; l++){
//                         if (nums[i]+ nums[j] + nums[k]+ nums[l] == target){
//                         return new int[] {i,j,k,l};
//                         }
//                     }
//                 }
//             }
//         }
        
//         return new int[] {} ;
//     }

//     public static void main(String args[]){
//         int nums[] = {1,0,-1,0,-2,2};
//         int target = 0;
//         int[] result = fourSum(nums, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]+ ", " + result[2]+ ", " +result[3]); 
//     }
// }

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         List<List<Integer>> result = new ArrayList<>();
        
//         // Sort the array to use two-pointer technique
//         Arrays.sort(nums);

//         // Iterate over the array with the first two indices
//         for (int i = 0; i < nums.length - 3; i++) {
//             // Skip duplicate numbers for the first index
//             if (i > 0 && nums[i] == nums[i - 1]) continue;

//             for (int j = i + 1; j < nums.length - 2; j++) {
//                 // Skip duplicate numbers for the second index
//                 if (j > i + 1 && nums[j] == nums[j - 1]) continue;

//                 // Use two pointers to find the remaining two numbers
//                 int left = j + 1, right = nums.length - 1;
//                 while (left < right) {
//                     int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    
//                     if (sum == target) {
//                         result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

//                         // Skip duplicates for `left` and `right`
//                         while (left < right && nums[left] == nums[left + 1]) left++;
//                         while (left < right && nums[right] == nums[right - 1]) right--;

//                         // Move pointers after finding a valid quadruplet
//                         left++;
//                         right--;
//                     } else if (sum < target) {
//                         // Move `left` to increase the sum
//                         left++;
//                     } else {
//                         // Move `right` to decrease the sum
//                         right--;
//                     }
//                 }
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] nums1 = {1, 0, -1, 0, -2, 2};
//         int target1 = 0;
//         System.out.println("Output: " + sol.fourSum(nums1, target1));

//         int[] nums2 = {2, 2, 2, 2, 2};
//         int target2 = 8;
//         System.out.println("Output: " + sol.fourSum(nums2, target2));
//     }
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array to simplify handling duplicates and using two pointers
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicates for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1, right = n - 1;

                while (left < right) {
                    // Use long to avoid overflow when calculating the sum
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        // Skip duplicates for `left` and `right`
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        // Move pointers
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
        int target = -294967296;

        System.out.println("Output: " + sol.fourSum(nums, target));
    }
}

