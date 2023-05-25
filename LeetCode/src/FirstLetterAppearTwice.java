import java.util.HashMap;
import java.util.HashSet;

public class FirstLetterAppearTwice {
    public static void main(String[] args) {

    }

    public char repeatedCharacter(String s) {
        /*
        Given a string s consisting of lowercase English letters, return the first letter to appear twice.
         */

        // create HashSet
        HashSet<Character> map = new HashSet<>();

        // loop through string
        for (int i = 0; i < s.length(); i++){
            // if letter appears in HashSet
            if (map.contains(s.charAt(i))){
                // return letter that appears twice
                return s.charAt(i);
            }
            // if not add letter to HashSet
            map.add(s.charAt(i));
        }
        return 'a';
    }
}
