package arrays.medium;

    //12 /1 / 2024
    //Brute forece approach

    //first we will just sort it
    //three numbers add up to 0 and return them as list of list of integers, there can't be duplicates
    // public static void threeSum(int nums[]) {
    //     boolean found = false;
    //     //loops through this array number by number
    //     for ( int i=0; i<nums.length; i++){
    //         for ( int j = i+1; j<nums.length; j++){
    //             for ( int k = j+1; k < nums.length; k++){
    //                 if(nums[i]+nums[j]+nums[k] == 0){
    //                     System.out.println("("+nums[i]+", "+nums[j]+", "+ nums[k]+ ")");
    //                     found = true;
    //                 }
    //             }
    //         }
    //     }
    //     if (!found){
    //         System.out.println("No triplets found !!");  
    //     }
    // }

    // //nick white -- youtube
    // // public List<List<Integer>> threeSum(int[] nums){
    // //     Arrays.sort(nums);
    // //     List<List<Integer>> output_arr = new LinkedList();
    // // }


    // public static void main(String args[]){
    //     int nums[] = {-1,0,1,2,-1,-4};
    //     threeSum(nums);
    // }
    import java.util.* ;

    class Solution{
    
        //      12/1/2024
    
        //brute force solution
    //     public static List<List<Integer>> threeSum(int[] nums) {
    //         List<List<Integer>> result = new ArrayList<>();
    //         // Sort the array to help with duplicate removal
    //         Arrays.sort(nums);
    
    //         // Loops through this array number by number
    //         //i represents the position of i
    //         for (int i = 0; i < nums.length - 2; i++) {
    //             // Skip duplicates for the first number
    //             if (i > 0 && nums[i] == nums[i - 1]) continue;
    
    //             for (int j = i + 1; j < nums.length - 1; j++) {
    //                 // Skip duplicates for the second number
    //                 if (j > i + 1 && nums[j] == nums[j - 1]) continue;
    
    //                 for (int k = j + 1; k < nums.length; k++) {
    //                     // Skip duplicates for the third number
    //                     if (k > j + 1 && nums[k] == nums[k - 1]) continue;
    
    //                     if (nums[i] + nums[j] + nums[k] == 0) {
    //                         result.add(Arrays.asList(nums[i], nums[j], nums[k]));
    //                     }
    //                 }
    //             }
    //         }
    
    //         return result;
    //     }
    
    //     public static void main(String args[]){
    //         int[] nums = {-1, 0, 1, 2, -1, -4};
    //         List<List<Integer>> triplets = threeSum(nums);
    //         System.out.println(triplets);
    //     }
    // }
    
    
    //optimal solution using two pointers
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort the array
    
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;
    
            int target = -nums[i];
            int left = i + 1, right = nums.length - 1;
    
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
    
                    // Move pointers and skip duplicates
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < target) {
                    left++; // Increase sum
                } else {
                    right--; // Decrease sum
                }
            }
        }
    
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> triplets = threeSum(nums);
        System.out.println(triplets); // Output the result
    }
    }