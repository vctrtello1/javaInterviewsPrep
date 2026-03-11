package Arrays.FindAllDuplicatesInAnArray;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Given an integer array nums of length n where all the integers of nums are in
    // the range [1, n] and each integer appears once or twice, return an array of
    // all the integers that appears twice.

    public static void main(String[] args) {
        Solution solution = new Main().new Solution();
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(solution.findDuplicates(nums));
    }

    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) { // Loop through the input array to mark the presence of numbers
                int index = Math.abs(nums[i]) - 1; // Calculate the index corresponding to the value at nums[i]
                if (nums[index] < 0) { // If the number at the calculated index is negative, it means we have already
                                       // encountered this number before, so it is a duplicate
                    result.add(index + 1); // Add the duplicate number (index + 1) to the result list
                } else {
                    nums[index] = -nums[index]; // Mark the number at the calculated index as negative to indicate its
                                                // presence
                }
            }
            return result;
        }
    }

}
