import static javax.swing.text.html.HTML.Attribute.N;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        /*
        input array nums    {1, 2, 3, 4}
        product to left of 1 is 1 since there are no elements to the left
        i = 0; element (L) = 1
        i = 1; element (L) = 1
        i = 2; element (L) = 2
        i = 3; element (L) = 6
        element (L) product {1, 2, 2, 6} (L) is left

        now we go to the right
        i = 3; element R = 1
        i = 2; element R = 4
        i = 1; element R = 12
        i = 0; element R = 24

        Element[] L {1, 1, 2, 6}
        Element[] R {24, 12, 4, 1}

        multiply L * R and get output array
        output: {24, 12, 8, 6}
         */
    }

    public static int[] productExceptSelf(int[] nums) {
        // initialize left, right, and output product array
        int n = nums.length; // get length of array

        int[] leftProduct = new int[n]; // left product array with size of nums array
        int[] rightProduct = new int[n]; // right product array with size of nums array

        int[] output = new int[n]; // output array

        leftProduct[0] = 1; // to the left of i = 0 is 1
        rightProduct[n-1] = 1; // to the right of i = n-1 is 1

        // loop from left side of array nums, start at i = 1 because i = 0 is 1
        for (int i = 1; i < nums.length; i++) {
            // i = 1, nums[0] * leftProduct[0] = 1 * 1 = 1
            // i = 2, nums[1] * leftProduct[1] = 2 * 1 = 2
            leftProduct[i] = nums[i-1] * leftProduct[i-1]; // multiply to the left of index
        }

        // loop from right side of array, start at n - 2 because (n-1) = 1
        for (int i = n - 2; i >= 0; i--){
            // i = 4 - 2 -> i = 2; nums[3] * rightProduct[3] = 4 * 1 = 4
            // i = 3 - 2 -> i = 1; nums[2] * rightProduct[2] = 3 * 4 = 12
            // i = 2 - 2 -> i = 0; nums[1] * rightProduct[1] = 2 * 12 = 24
            rightProduct[i] = nums[i+1] * rightProduct[i+1];
        }

        //
        for (int i = 0; i < nums.length; i++){
            // multiple left and right array at index i to put in output array
            output[i] = leftProduct[i] * rightProduct[i];
        }

        return output;
    }
}


