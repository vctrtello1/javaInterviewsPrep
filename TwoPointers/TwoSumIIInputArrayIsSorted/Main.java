package TwoPointers.TwoSumIIInputArrayIsSorted;

public class Main {

    // Given a 1-indexed array of integers numbers that is already sorted in
    // non-decreasing order, find two numbers such that they add up to a specific
    // target number. Let these two numbers be numbers[index1] and numbers[index2]
    // where 1 <= index1 < index2 <= numbers.length.
    // Return the indices of the two numbers, index1 and index2, added by one as an
    // integer array [index1, index2] of length 2.
    // The tests are generated such that there is exactly one solution. You may not
    // use the same element twice.

    public static void main(String[] args) {
        Solution solution = new Main().new Solution();
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = solution.twoSum(numbers, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int left = 0; // Initialize left pointer at the beginning of the array
            int right = numbers.length - 1; // Initialize right pointer at the end of the array

            while (left < right) { // Loop until the two pointers meet
                int sum = numbers[left] + numbers[right]; // Calculate the sum of the two numbers at the pointers

                if (sum == target) { // If the sum matches the target, return the indices (1-indexed)
                    return new int[] { left + 1, right + 1 };
                } else if (sum < target) { // If the sum is less than the target, move the left pointer to the right
                    left++;
                } else { // If the sum is greater than the target, move the right pointer to the left
                    right--;
                }
            }

            return new int[] {}; // Return an empty array if no solution is found (though problem guarantees one
                                 // solution)
        }
    }

}
