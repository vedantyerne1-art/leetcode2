import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {

        // Create a copy of the original array
        int[] expected = heights.clone();

        // Sort the copied array
        Arrays.sort(expected);

        int count = 0;

        // Compare original and sorted arrays
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}