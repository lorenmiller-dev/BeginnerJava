import java.util.HashSet;

public class ValidAnagram {
    public static void main(String[] args) {
        String t = "rat";
        String s = "car";

        System.out.println(isAnagram(t, s));
    }

    /**
     * @param t String
     * @param s String
     * @return true if t and s are an anagram, otherwise false
     */
    public static boolean isAnagram(String t, String s) {
        // Check if the lengths of the two strings are different, if so, return false
        if (t.length() != s.length()) return false;

        // Create an integer array `charCount` of size 26 to represent the occurrences of each character in the alphabet
        int[] charCount = new int[26];

        // Iterate through the characters of string `s`
        for (int i = 0; i < s.length(); i++) {
            // Increment the count of the character at index `i` in the array `charCount`
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        // Iterate through the elements of the `charCount` array
        for (int count : charCount) {
            // If any element is non-zero, it means the corresponding character is not balanced in `s` and `t`, so return false
            if (count != 0) {
                return false;
            }
        }

        // If all characters are balanced in `s` and `t`, return true
        return true;
    }
}

