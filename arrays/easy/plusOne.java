public class plusOne {
    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};

        plusOne solution = new plusOne();

        int[] result1 = solution.plusOne(digits1);
        int[] result2 = solution.plusOne(digits2);
        int[] result3 = solution.plusOne(digits3);

        System.out.print("Result 1: ");
        printArray(result1); 

        System.out.print("Result 2: ");
        printArray(result2);

        System.out.print("Result 3: ");
        printArray(result3);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num);
        }
        System.out.println(); 
    }

    // The plusOne method remains the same as provided earlier
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // If all digits are 9, create a new array with an extra 1 at the beginning
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}