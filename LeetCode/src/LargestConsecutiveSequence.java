import java.util.HashSet;

public class LargestConsecutiveSequence {
    public static void main(String[] args) {

    }

    /*
    find longest consecutive sequence
    ex.) 1 -> 2 -> 3 is a consecutive sequence
     */

    // first thoughts on solving this without much knowledge on data structures, sort array from least to greatest
    // then see if the values are consecutive, start from i = 0 and see if the next int is nums[i] + 1 if so continue
    // if not skip to next index


    public static int longestConsecutive(int[] nums) {
        // initialize HashSet
        HashSet<Integer> set = new HashSet<>();

        // store longest sequence
        int longest = 0;

        // add elements from nums array to HashSet
        for (int i = 0; i < nums.length; i++) {
            // store nums[i] in variable
            int num = nums[i];
            // add num(nums[i]) to HashSet
            set.add(num);
        }

        // loop through array
        for (int i = 0; i < nums.length; i++) {
            // store nums[i] again
            int n = nums[i];

            // check if element is start of sequence, if nums[i] - 1 doesn't exist then it is start of sequence
            if (set.contains(n - 1)) {
                // keep track of length of sequence
                int length = 0;
                // while loop through HashSet, checking consecutive sequence for n
                // ex.) input is 100;
                // 100 + 0 exists? length++
                // 100 + 1 exists? no get out of while loop
                while (set.contains(n + length)) {
                    // increase length by 1
                    length += 1;
                }

                // set longest to max length of sequence
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}

