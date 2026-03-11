package Arrays.FindAllDisapperadNumbersInAnArray;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
    // elements appear twice and others appear once.
    // Find all the elements of [1, n] inclusive that do not appear in this array.
    // Could you do it without extra space and in O(n) runtime? You may assume the
    // returned list does not count as extra space.

    public static void main(String[] args) {
        Solution solution = new Main().new Solution(); // Create an instance of the Solution class to call the method
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(solution.findDisappearedNumbers(nums));
    }

    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) { // Method to find all disappeared numbers in the array
            for (int i = 0; i < nums.length; i++) { // Loop through the input array to mark the presence of numbers
                int index = Math.abs(nums[i]); // Get the absolute value of the current number to find the corresponding
                                               // index
                if (nums[index - 1] > 0) { // If the number at the corresponding index is positive, it means the number
                                           // has not been marked as present yet
                    nums[index - 1] *= -1; // Mark the number as present by negating the value at the corresponding
                                           // index
                }
            }
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) { // Loop through the modified array to find the indices of the
                                                    // positive numbers, which correspond to the
                // disappeared numbers
                if (nums[i] > 0) { // If the number at index i is positive, it means the number (i + 1) has not
                                   // been marked as present, so it is a disappeared number
                    res.add(i + 1);
                }
            }
            return res;
        }
    }

}
