public class ContainerWithMostWater {
    /**
     *
     * @param height input array of integers
     * @return max area 
     */
    public static int maxArea(int[] height) {
        // store max value int
        int max_area = 0;

        // solve using two pointers

        // initialize left and right pointers
        int left = 0;
        int right = height.length - 1;

        // loop through while left pointer < right pointer
        while (left <  right) {
            // if left height is less than right height, calculate area using lesser height
            if (height[left] < height[right]){
                // calculate max area at left and right pointers; height of left multiplied by length between
                // left and right pointers
                max_area = Math.max(max_area, height[left] * (right - left));

                // increment left pointer
                left++;
                // height of right less than left height; height of right multiplied by length between left and right pointer
            } else {
                // calculate max area; height of right multiplied by length between left and right pointer
                max_area = Math.max(max_area, height[right] * (right - left));

                // decrement right pointer
                right--;
            }
        }
        return max_area;
    }

    public static void main(String[] args) {
        // example array
        int height[] = {1, 2, 3, 4};
    }
}
