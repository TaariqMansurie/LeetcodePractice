package arrays.easy;

// class Solution {
//     public int singleNumber(int[] nums) {
//         int result = 0; //since XOR with 0 returns same number
//         for(int i=0; i<nums.length; i++) {
//             result = result^nums[i];        // result = (result) XOR (array element at i) 
//         }
//         return result; 
//     }
// }

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR each number with the result
        }
        return result;
    }

    public static void main(String[] args) {
        plusOne solution = new plusOne();
        System.out.println(solution.singleNumber(new int[]{2, 2, 1})); // Output: 1
        System.out.println(solution.singleNumber(new int[]{4, 1, 2, 1, 2})); // Output: 4
        System.out.println(solution.singleNumber(new int[]{1})); // Output: 1
    }
}
