public class permutationInString {
    public static void main(String[] args) {

    }

    /**
     * see if string 2 contains the permutation of string 1
     *
     * @param s1 string 1
     * @param s2 string 2
     * @return true if s2 contains permutation in s1
     */
    public boolean checkInclusion(String s1, String s2){
        // base cases
        // if string 1 > string 2 or string 2 is empty return false
        if (s1.length() > s2.length() || s2.length() == 0){
            return false;
        }
        // string 1 length is empty return true
        if (s1.length() == 0){
            return true;
        }

        int x = s1.length();
        int y = s2.length();

        int[] a1 = new int[26];
        int[] a2 = new int[26];

        for (int end = 0; end < x; end++){

        }
        return true;
    }
}
