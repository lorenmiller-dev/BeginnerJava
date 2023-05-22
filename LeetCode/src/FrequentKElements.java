import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequentKElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3, 3, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);

        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    /**
     *
     * @param nums array of integers
     * @param k number of total frequent elements
     * @return k most frequent elements
     */
    public static int[] topKFrequent(int[] nums, int k) {
        // int array of size k, to store result
        int[] answer = new int[k];
        // create HashMap to count frequency of each element in nums array
        Map<Integer, Integer> map = new HashMap<>();
        // loop through nums array
        for (int i = 0; i < nums.length; i++){
            // if element from nums array isn't in HashMap, put element as key and +1 to value
            // default value is 0 if element is not in HashMap, once put in value + 1
            // iterate through loop checking each element, ex. {1, 1, 2, 3, 3, 3}
            //          K=V:
            // i = 0 -> 1=1
            // i = 1 -> 1=2
            // i = 2 -> 2=1
            // i = 3 -> 3=3
            // 1 has a frequency of 2, 2 has 1, and 3 has 3 in nums array
            int num = nums[i]; // takes nums[i] and stores it in HashMap

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Sort key value pairs in a ArrayList
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // sorting key value pairs
        // ex.
        // a: 1=2
        // b: 2=1
        // c: 3=3
        // compare a : b -> 2 - 1 = 1; a > b
        // compare c : a -> 3 - 2 = 1; c > a
        list.sort((a,b) -> b.getValue() - a.getValue());

        // find k most frequent elements
        for (int i = 0; i < k; i++) {
            // loop through ArrayList until i < k
            // stores k most frequent elements in nums array in empty answer array to output answer
            answer[i] = list.get(i).getKey();
        }

        return answer; // return k most frequent elements in nums array
    }
}
