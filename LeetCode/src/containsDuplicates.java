import java.util.HashSet;

public class containsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 5, 4, 2, 4, 5};
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
        HashSet<Integer> numbers = new HashSet<>();

        //loop through array
        for (int i = 0; i < nums.length; i++){
            if (numbers.contains(nums[i])) return true; //number in hash sett = i, return true
            numbers.add(nums[i]);
        }
        return false;
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
