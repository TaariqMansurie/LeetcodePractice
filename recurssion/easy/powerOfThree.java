package recurssion.easy;

class Solution {
    public boolean isPowerOfThree(int n) {
      //base case
        // if (n%2 != 0 ){
        //     return ;
        // }
        if (n <= 0) return false; // Negative numbers and zero are not powers of three.
        if (n == 1) return true;  // 3^0 = 1, so 1 is a power of two.
        //kaam
        // isPoweOfThree(3^x=n);
        return (n % 3 == 0) && isPowerOfThree(n / 3);
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int n = 3;
        System.out.println(sol.isPowerOfThree(n));

        int n2 = 4; // Example input
        System.out.println(sol.isPowerOfThree(n2)); // Output: false
    }
}

//making changes
