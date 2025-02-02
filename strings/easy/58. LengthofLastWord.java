public class LengthofLastWord{
        public int lengthOfLastWord(String s) {
            s = s.trim(); // Step 1: Remove trailing spaces
            int length = 0;
    
            // Step 2: Start from the end and count the last word's length
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == ' ') break; // Stop when a space is found
                length++;
            }
            return length;
        }
    
        public static void main(String[] args) {
            LengthofLastWord sol = new LengthofLastWord();
            System.out.println(sol.lengthOfLastWord("Hello World")); // Output: 5
            System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
            System.out.println(sol.lengthOfLastWord("luffy is still joyboy")); // Output: 6
        }
}
