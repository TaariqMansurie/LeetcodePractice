package recurssion.easy;

public class powerOfTwo {
    public boolean isPowerOfTwo(int n) {
        //base case
        // if (n%2 != 0 ){
        //     return ;
        // }
        if (n <= 0) return false; // Negative numbers and zero are not powers of two.
        if (n == 1) return true;  // 2^0 = 1, so 1 is a power of two.
        //kaam
        // isPoweOfTwo(2^x=n);
        return (n % 2 == 0) && isPowerOfTwo(n / 2);
    }
    public static void main(String args[]){
        powerOfTwo sol = new powerOfTwo();
        int n = 16;
        System.out.println(sol.isPowerOfTwo(n));

        int n2 = 3; // Example input
        System.out.println(sol.isPowerOfTwo(n2)); // Output: false
    }
}
