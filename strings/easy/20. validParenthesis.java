package strings.easy;

//counter method
// class Solution {
//     public boolean isValid(String s) {
//         int count = 0;

//         for (char c : s.toCharArray()) {
//             if (c == '(') {
//                 count++; // Increment for every opening parenthesis
//             } else if (c == ')') {
//                 count--; // Decrement for every closing parenthesis
//                 if (count < 0) {
//                     return false; // Too many closing parentheses
//                 }
//             }
//         }

//         return count == 0; // Valid if all parentheses are balanced
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();

//         System.out.println(solution.isValid("()"));      // true
//         System.out.println(solution.isValid("(())"));    // true
//         System.out.println(solution.isValid("(()"));     // false
//         System.out.println(solution.isValid("())"));     // false
//     }
// }
import java.util.Stack;

// stack method
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Push opening brackets onto the stack
            } else {
                // Check if the stack is empty or the top of the stack doesn't match
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // The stack should be empty if all brackets were matched
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s1 = "()";         // Expected output: true
        String s2 = "()[]{}";     // Expected output: true
        String s3 = "(]";         // Expected output: false
        String s4 = "([)]";       // Expected output: false
        String s5 = "{[]}";       // Expected output: true

        // Print results
        System.out.println("Test case 1: " + solution.isValid(s1)); // true
        System.out.println("Test case 2: " + solution.isValid(s2)); // true
        System.out.println("Test case 3: " + solution.isValid(s3)); // false
        System.out.println("Test case 4: " + solution.isValid(s4)); // false
        System.out.println("Test case 5: " + solution.isValid(s5)); // true
    }
}

