import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        int end = 0;
        Set<Character> charSet = new HashSet<>();

        while (end < s.length()) {
            char ch = s.charAt(end);
            if (!charSet.contains(ch)) {
                charSet.add(ch);
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            } else {
                charSet.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Input: " + s);
        System.out.println("Output: " + lengthOfLongestSubstring(s));
    }
}
