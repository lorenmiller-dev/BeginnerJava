public class ValidPalindrome {
    public static void main(String[] args) {

    }

    /**
     *
     * @param s String
     * @return true if string is palindrome, otherwise false
     */
    public boolean isPalindrome(String s) {
        // remove all non-alphanumeric characters and to lowercase
        String fixedString = "";

        // if it is digit or letter add to empty fixedString
        for (char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                fixedString += c;
            }
        }

        // set fixedString to lowercase
        fixedString = fixedString.toLowerCase();

        // initialize left and right pointers
        int left = 0;
        int right = fixedString.length() - 1;

        while(left < right) {
            // if character from left and right not the same return false
            if (fixedString.charAt(left) != fixedString.charAt(right)){
                return false;
            }

            left++; // increase left pointer to look at next character to the right
            right--; // decrease right pointer to look at next character to the left
        }
        return true; // string s is palindrom return true
    }
}
