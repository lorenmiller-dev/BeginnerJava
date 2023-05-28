import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> threeSums(int[] nums) {
        // sort array
        Arrays.sort(nums); // sorted array {-4, -1, -1, 0, 1, 2}

        // create linked list to store result
        List<List<Integer>> result = new LinkedList<>();

        // loop through array
        // set i < nums.length - 2; because we need at least 3 elements to form a valid triplet
        //
        for (int i = 0;  i < nums.length - 2; i++) {
            // check if i = 0 || (i > 0 && there is no duplicate)
            // checking nums[i] != nums[i-1] ensure duplicate elements are skipped and
            // first occurrence numbers is considered, avoids duplicates in final result
            if( i == 0 || (i > 0&& nums[i] != nums[i - 1])){
                // want to find a pair of numbers, set lower and upper boundary
                int low = i + 1; // start one index to the right of starting index
                int high = nums.length - 1; // right pointer starts at end of array
                int sum = 0 - nums[i]; // three numbers must add up to zero, 0 - 1 = 1; now we search for two numbers
                // that add up to 1

                //
                while (low < high) {
                    // if low and high equal sum then we found our sum
                    if (sum == nums[low] + nums[high]){
                        // our triplet array
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        // see if next element from left is duplicate, if duplicate low++;
                        while (low < high && nums[low] == nums[low + 1]){
                            low++;
                        }
                        // see if next element from right is duplicate, if duplicate high--;
                        while (low < high && nums[high] == nums[high - 1]){
                            high--;
                        }

                        // increment low and decrement high pointers
                        low++;
                        high--;
                        // if number is bigger than sum
                    } else if (nums[low] + nums[high] > sum) {
                        // decrement high pointer
                        high--;
                        // number is too small
                    } else {
                        // increment low pointer
                        low++;
                    }
                }
            }
        }
        // return result triplet arrays that add up to 0
        return result;
    }
}
