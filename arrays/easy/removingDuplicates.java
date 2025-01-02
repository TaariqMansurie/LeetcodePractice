class Solution {
    public int removeDuplicates(int[] nums) {
        //if array is epty, return 0
        if(nums.length == 0){
            return 0;
        } 

        int index = 0 ;

        for(int i=1; i<nums.length; i++){
            if (nums[i] != nums[index]){
                index ++;
                nums[index] = nums [i];
            }
        }

        //returnign the count of unique elements (index +1, because index is 0 based)
        return index + 1;
    }
    public static void main(String args[]){
        int[] nums = {0,0,1,1,1,2,2,3,3,4,4}; // Input array    
        int[] expectedNums = {0,1,2,3,4}; // The expected answer with correct length

        Solution soln = new Solution();
        int k = soln.removeDuplicates(nums); // Calls your implementation

        //verifying the result
        System.out.println("Number of unique elements in the array are: "+k);
        System.out.print("{");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]+ ", ");
        }
        System.out.println("}");

        //testing teh assertions
        assert k == expectedNums.length;
        for (int i=0; i<k; i++){
            assert nums[i] == expectedNums[i];
        }
  }
    
}

