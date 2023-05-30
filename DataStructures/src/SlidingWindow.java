public class SlidingWindow {
    public static void main(String[] args) {
        /**
         * Find max sum subarray of fixed size K
         *
         * input:
         * [4, 2, 1, 7, 8, 1, 2, 8, 1, 0]
         */

        // input array
        int[] array = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
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
        return 1;
    }
}
