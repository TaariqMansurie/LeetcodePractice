public class LongestCommonPrefix {
         public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) return "";
    
            // Start with the first word as the assumed prefix
            String prefix = strs[0];
    
            // Compare with each string in the array
            for (int i = 1; i < strs.length; i++) {
                while (strs[i].indexOf(prefix) != 0) {
                    // Reduce the prefix length
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) return "";
                }
            }
            return prefix;
        }
    
        public static void main(String[] args) {
            LongestCommonPrefix sol = new LongestCommonPrefix();
    
            // Example 1
            String[] words1 = {"flower","flow","flight"};
            System.out.println(sol.longestCommonPrefix(words1)); // Output: "fl"
    
            // Example 2
            String[] words2 = {"dog","racecar","car"};
            System.out.println(sol.longestCommonPrefix(words2)); // Output: ""
    
            // Edge case
            String[] words3 = {"apple"};
            System.out.println(sol.longestCommonPrefix(words3)); // Output: "apple"
        }
    }

