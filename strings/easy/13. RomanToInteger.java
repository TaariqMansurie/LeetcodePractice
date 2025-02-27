import java.util.*;

public class Solution {
    public static int romanToInt(String s) {
        // Mapping Roman numerals to their integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Iterate from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));

            // If the current value is smaller than the previous one, subtract it
            if (currValue < prevValue) {
                total -= currValue;
            } else {
                total += currValue;
            }

            // Update previous value for next iteration
            prevValue = currValue;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));       // Output: 3
        System.out.println(romanToInt("LVIII"));     // Output: 58
        System.out.println(romanToInt("MCMXCIV"));   // Output: 1994 // // // // 
    }
}
