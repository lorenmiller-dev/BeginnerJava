public class ContainerWithMostWater {
    /**
     *
     * @param height input array of integers
     * @return max area 
     */
    public static int maxArea(int[] height) {
        // store highest max area
        int max_area = 0;

        // two pointers
        int left = 0;
        int right = height.length - 1;

        // while loop when left pointer < right pointer
        while (left < right){
            // height of left < right calculate max area of smaller height
            if (height[left] < height[right]){

                // set new max area and calculate area lesser height * length between pointers
                max_area = Math.max(max_area, height[left] * (right - left));
                // increment left pointer
                left++;

                // right height is less than left
            } else {
                // set new max area and calculate area lesser height * length between pointers
                max_area = Math.max(max_area, height[left] * (right - left));
                // decrement right pointer
                right--;
            }
        }
        // return highest max area
        return max_area;
    }
}
