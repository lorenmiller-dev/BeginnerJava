public class LongestRepeatingCharacter {
    public static void main(String[] args) {

    }

    public static int longestRepeatingCharacter(String s, int k){
        // initialize variables
        int start = 0; // starting window pointer
        int longest = 0;
        int max_count = 0;

        int n = s.length(); // store length of substring into variable for easier code write-ability
        int[] char_count = new int[26];

        // loop through array
        for (int end = 0; end < n; end++){
            int curr_char_count = char_count[s.charAt(end) - 'A'];
            curr_char_count++;
            max_count = Math.max(max_count, curr_char_count);

            while (end - start - max_count + 1 > k){
                char_count[s.charAt(start) - 'A']--;
                start++;
            }
            longest = Math.max(longest, end - start);
        }
        return longest;
    }
}
