package arrays.medium;

class Solution {
    //using kadane's algorithm
    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i=0; i<nums.length; i++){
            currSum = currSum + nums[i];

            if (currSum > maxSum){
                maxSum = currSum;
            }

            if (currSum < 0){
                currSum = 0;
            }
            // maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("The max sub array sum is:" +maxSum);

        return maxSum;
    }

    public static void main(String args[]){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }
}