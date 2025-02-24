package strings.medium;

public class Solution {
    public String intToRoman(int num) {
        // Define the values and their corresponding Roman numerals
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        // Iterate through the values and construct the Roman numeral
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(symbols[i]);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.intToRoman(3749)); // Output: "MMMDCCXLIX"
        System.out.println(sol.intToRoman(58));   // Output: "LVIII"
        System.out.println(sol.intToRoman(1994)); // Output: "MCMXCIV"
    }
}
//just to check -- --- -- -- - -- - - - -- learning swift too // ......