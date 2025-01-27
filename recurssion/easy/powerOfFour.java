package recurssion.easy;

class Solution {
    public boolean isPowerOfFour(int n) {
      //base case
        // if (n%2 != 0 ){
        //     return ;
        // }
        if (n <= 0) return false; // Negative numbers and zero are not powers of three.
        if (n == 1) return true;  // 3^0 = 1, so 1 is a power of two.
        //kaam
        // isPoweOfFour(3^x=n);
        return (n % 4 == 0) && isPowerOfFour(n / 4);
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        int n = 3;
        System.out.println(sol.isPowerOfFour(n));

        int n2 = 4; // Example input
        System.out.println(sol.isPowerOfFour(n2)); // Output: false
    }
}