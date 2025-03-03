package strings.medium;

public class stringToInteger {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0; // Edge case: empty string

        int i = 0, sign = 1, result = 0;
        int n = s.length();
        int INT_MAX = Integer.MAX_VALUE, INT_MIN = Integer.MIN_VALUE;

        // Step 1: Ignore leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Handle sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits to integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Step 4: Check for integer overflow
            if (result > (INT_MAX - digit) / 10) {
                return (sign == 1) ? INT_MAX : INT_MIN;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        stringToInteger sol = new stringToInteger();
        System.out.println(sol.myAtoi("42"));            // Output: 42
        System.out.println(sol.myAtoi("   -042"));       // Output: -42
        System.out.println(sol.myAtoi("1337c0d3"));      // Output: 1337
        System.out.println(sol.myAtoi("0-1"));          // Output: 0
        System.out.println(sol.myAtoi("words and 987"));// Output: 0
        System.out.println(sol.myAtoi("-91283472332")); // Output: -2147483648 (Clamped to INT_MIN) // truie
    }

}