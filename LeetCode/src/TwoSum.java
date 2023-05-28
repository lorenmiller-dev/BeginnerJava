import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 11, 15};
        int target = 9;

    }

    /*
    HashMap - collection of key(K) value(V) pairs, can give key retrieve value (constant time)
    {1, 2, 7, 11, 15}
    target = 9

    trying to find values in nums[] that add up to target
    check to see if i exists in map, i=1 is 2 it doesn't exist,
    so we check to see what value adds up to 9 which is 7
    7 is complement (K) and our value (V) is the index = 1
    Check next element in array which is i = 2, 7
    Check to see if 7 is in HashMap, and it is
    We know indexes that add up to target
    We are looking at number 7 and look in HashMap and see if 7 is a key in our HashMap
    Value associated is 1, which is an index that we can find a number that we can add to get 9

    HashMap.
    K -> V
    8 -> 0        i=0 -> 1 to get to target 9 - 1 = 8 (K) i = 0 (V)
    7 -> 1        i=1 -> 2, 9 - 2 = 7(K) i=1(V)


    output: {(index of val currently on, index i that we find when we look up in HashMap)}
    output: {2, 1} explanation: value currently on = 7 at index i = 2 so {2, _},
                                looking up value 7 in HashMap has a value of 1, index i = 1
                                result -> {2, 1}
     */

    /** HashMap Solution
     *
     * @param nums int array
     * @param target two elements from nums array that add up to target
     * @return two elements add up and equal target
     */
    public int[] twoSum(int[] nums, int target) {
        // create HashMap
        Map<Integer, Integer> map = new HashMap<>();
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Get the index of the complement of the current number in the map
            Integer index = map.get(nums[i]);
            // If the complement exists in the map, return the indices of the pair
            if (index != null) {    
                return new int[] {i, index};
            }
            // Calculate the complement of the current number and put it in the map
            map.put(target - nums[i], i);
        }
        // No value adds to target return nums array
        return nums;
    }

    /** Two-Pointer Solution
     * Note: two pointer solution only works if array is sorted
     *
     * @param nums input array of numbers
     * @param target value that two elements of nums array add up to
     * @return two elements from nums array that equal target
     */
    public int[] twoPointer(int[] nums, int target) {
        // initialize left and right pointer
        int left = 0;
        int right = nums.length - 1;

        // while loop left < right
        while (left < right){
            // sum variable
            int sum = nums[left] + nums[right];
            // if two elements from nums array equals target
            if (sum == target) {
                // return two elements that add up to target
                return new int[] {left, right};
                // sum smaller than target need bigger number
            } else if (sum < target) {
                left++; // increase left pointer by 1
            } else {
                // need smaller number than target
                right--; // decrease right pointer by 1
            }
        }
        // no values that add up to target return nums
        return nums;
    }
}
