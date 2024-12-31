class Solution {
    public int removeElement(int[] nums, int val) {
        int writeIndex = 0; // pointer to track the position 

        for (int readIndex = 0 ; readIndex <nums.length; readIndex ++){ //traversing the entire array
            if(nums[readIndex] != val){
                //if it is not equal to val which is passed in the main funciton, write it at the writeIndex
                nums[writeIndex] = nums[readIndex];
                writeIndex ++;
            }
        }

        //returning the writeIndex value as int
        return writeIndex;
    }

    public static void main(String args[]){
        Solution soln = new Solution();

        int [] nums= {3,2,2,3};
        int val = 3;

        int k = soln.removeElement(nums, val) ; // removes elements that are equal to 3 using the above function

        System.out.println("Number of elements not equal to the val are:" +k);
        System.out.println("Modified array is: ");
        for (int i=0; i<k; i++){
            System.out.println(nums[i]+ " ");
        }
    }
}
