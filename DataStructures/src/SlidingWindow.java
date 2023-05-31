import java.util.HashMap;

public class SlidingWindow {
    public static void main(String[] args) {
        /**
         * Find max sum subarray of fixed size K
         *
         * input:
         * [4, 2, 1, 7, 8, 1, 2, 8, 1, 0]
         */

        // input array
        int[] array = {4, 2, 2, 7, 8, 1, 2, 8, 1, 0};
        // target sum
        int sum = 8;

        // pass data through findMaxSumSubarray
        System.out.println(findMaxSumSubarray(array, 3));

        // pass data through findSmallestSubarray
        System.out.println(findSmallestSubarray(array, sum));


    }

    /**
     *
     * @param array input array
     * @param k elements to add together to get max sum
     * @return max sum in subarray
     */
    public static int findMaxSumSubarray(int[] array, int k){
        // max value
        int max_value = Integer.MIN_VALUE;

        // current sum
        int current_sum = 0;

        // loop through array
        for (int i = 0; i < array.length; i++){
            // add current sum and array[i]
            current_sum += array[i];
            // if i greater than k - 1,
            // we do k - 1 because we want 3 elements to create max sum, i >= 3 - 1 = 2
            // so three elements i = 0, 1, 2 are three elements that add together
            if (i >= k - 1){
                // compare max calue and current sum and if current sum is bigger than max value update max value
                max_value = Math.max(max_value, current_sum);
                // we want to get rid of the far left element
                current_sum -= array[i - (k - 1)]; // i = 2, k = 3 -> 2 - (3 - 1) = 0 -> array[0]
            }
        }
        // return highest sum
        return max_value;
    }

    /**
     * Find the smallest sum that is >= 8
     *
     * @param array input array
     * @param sum target sum
     * @return smallest sub array that is >= to target sum
     */
    public static int findSmallestSubarray(int[] array, int sum){
        int minWindowSize = Integer.MAX_VALUE; // store output of smallest subarray
        int start = 0; // track of start of window
        int currentWindowSum = 0; // store current window sum

        // loop through array
        for (int end = 0; end < array.length; end++){
            //
            currentWindowSum += array[end];
            // while current window sum >= sum
            while (currentWindowSum >= sum){
                // update smallest subarray size, end minus start + 1 since elements are indexed at 0
                minWindowSize = Math.min(minWindowSize, end - start + 1);
                // subtract element at index start from current window sum
                currentWindowSum -= array[start];
                // increment start
                start++;
            }
        }
        // return minimum window size
        return minWindowSize;
    }

    /**
     *
     * Finds the length of the longest substring in a given string s that contains at most k distinct characters.
     *
     * @param s input string s
     * @param k maximum number of distinct characters allowed in the substring
     * @return length of the longest substring with at most k distinct characters
     */
    public static int longestSubstringLength(String s, int k){
        // Initialize variables
        int longest = 0;  // Stores the length of the longest substring
        int start = 0;  // Stores the starting index of the current substring

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        // loop through substring 's'
        for (int end = 0; end < s.length(); end++){
            // Get the current character at index 'end'
            char rightChar = s.charAt(end);
            // Update the frequency map with the current character
            charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);
            // while distinct characters exceeds limit k
            while (charFrequencyMap.size() > k){
                // character at start index of substring
                char leftChar = s.charAt(start);
                // reduce frequency of character at start of index
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
                // remove character if frequency = 0
                if (charFrequencyMap.get(leftChar) == 0){
                    // remove character from HashMap
                    charFrequencyMap.remove(leftChar);
                }
                // move start index to the right to shrink substring
                start++;
            }
            // set new longest value
            longest = Math.max(longest, end - start + 1);
        }
        // return longest length of substring with k distinct elements
        return longest;
    }
}
