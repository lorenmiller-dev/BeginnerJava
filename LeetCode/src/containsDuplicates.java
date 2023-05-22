import java.util.HashSet;

public class containsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 2};
        System.out.println(ContainsDuplicates(nums));
        System.out.println(distinctElements(nums));
    }

    /**
     * Uses HashSet
     *
     * @param nums array
     * @return true if nums contains duplicates, false otherwise
     */
    public static boolean ContainsDuplicates(int[] nums){
        // Create HashSet
        HashSet<Integer> map = new HashSet<>();

        // loop through array
        for (int i = 0; i < nums.length; i++){
            // Check if nums[i] is in HashSet
            if (map.contains(nums[i])) return true;
            // if not add nums[i] to HashSet
            map.add(nums[i]);
        }
        return false; // return false if on duplicates exist
    }

    public static int distinctElements(int[] nums){
        HashSet<Integer> numbers = new HashSet<>(); // create HashSet

        // loop through the array and add each element to the HashSet
        for (int i = 0; i < nums.length; i++) {
            numbers.add(nums[i]); // add the current element at index i to the HashSet
        }
        return numbers.size(); // return the size of the HashSet, which represents the count of distinct elements
    }
}
