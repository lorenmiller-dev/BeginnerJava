import java.util.ArrayList;
import java.util.Arrays;

public class StaticAndDynamicArray {
    public static void main(String[] args) {
        // create dynamic array
        // ArrayLists can only use objects but can use wrapper classes: Integer, Boolean, String, Long, etc
        // Don't have fixed size
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // add elements to array
        dynamicArray.add(10);
        dynamicArray.add(15);
        System.out.println(dynamicArray);

        // get element at certain index
        System.out.println(dynamicArray.get(0));

        // change element
        dynamicArray.set(1, 20);
        System.out.println(dynamicArray);

        // remove element from array
        dynamicArray.remove(1);
        System.out.println(dynamicArray);

        // Array vs ArrayList
        String[] stringArray = {"Jr", "Cameron", "Jude", "Luke"}; // String Array, fixed size

        ArrayList<String> namesList =
                new ArrayList<>(Arrays.asList("Jr", "Cameron", "Jude", "Luke")); // ArrayList, don't have fixed size, only hold objects

        System.out.println(stringArray[1]); // get string from array at i = 1
        System.out.println(namesList.get(1)); // get string from certain index


    }
}
