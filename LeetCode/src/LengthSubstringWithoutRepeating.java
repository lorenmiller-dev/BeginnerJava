import java.util.HashSet;

public class LengthSubstringWithoutRepeating {
    public static void main(String[] args) {

    }
    public int lengthOfLongestSubstring(String s) {
        // initialize variables
        int start = 0; // starting window pointer
        int longest = 0;

        // create HashSet to start string 's' characters
        HashSet<Character> set = new HashSet<>();

        // loop through string s length
        for(int end = 0; end < s.length(); end++){
            // if character is not in HashSet
            if(!set.contains(s.charAt(end))){
                // add character to HashSet
                set.add(s.charAt(end));
                // set the longest variable to size of HashSet
                longest = Math.max(longest, set.size());
            } else {
                // remove character at start pointer
                set.remove(s.charAt(start));
                end--; // decrement end pointer
                start++; // increment start pointer
            }
        }
        // return longest length of substring
        return longest;
    }
}
