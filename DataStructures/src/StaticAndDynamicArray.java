import java.util.ArrayList;

public class StaticAndDynamicArray {
    public static void main(String[] args) {
        // create dynamic array
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
    }
}
