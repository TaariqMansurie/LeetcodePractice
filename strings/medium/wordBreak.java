package strings.medium;

import java.util.*;

public class wordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict); // Convert list to set for quick lookup
        Map<String, Boolean> memo = new HashMap<>(); // Memoization map
        return wordBreakHelper(s, wordSet, memo);
    }

    private static boolean wordBreakHelper(String s, Set<String> wordSet, Map<String, Boolean> memo) {
        if (s.isEmpty()) return true; // Base case

        if (memo.containsKey(s)) return memo.get(s); // Return cached result

        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            String suffix = s.substring(i);

            if (wordSet.contains(prefix) && wordBreakHelper(suffix, wordSet, memo)) {
                memo.put(s, true);
                return true;
            }
        }

        memo.put(s, false);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(wordBreak("leetcode", Arrays.asList("leet", "code"))); // true
        System.out.println(wordBreak("applepenapple", Arrays.asList("apple", "pen"))); // true
        System.out.println(wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat"))); // false
    }
}

