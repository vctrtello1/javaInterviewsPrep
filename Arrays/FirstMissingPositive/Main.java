package Arrays.FirstMissingPositive;

public class Main {

    // Given an unsorted integer array nums, return the smallest missing positive
    // integer.

    public static void main(String[] args) {
        Solution solution = new Main().new Solution();
        int[] nums = { 3, 4, -1, 1 };
        System.out.println(solution.firstMissingPositive(nums));
    }

    class Solution {
        public int firstMissingPositive(int[] nums) {
            int n = nums.length;

            for (int i = 0; i < n; i++) { // Loop through the input array to place each number in its correct position
                while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                    int temp = nums[nums[i] - 1]; // Swap the current number with the number at its correct position
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = temp;
                }
            }

            for (int i = 0; i < n; i++) { // Loop through the modified array to find the first index where the number is
                                          // not
                                          // in its correct position
                if (nums[i] != i + 1) { // If the number at index i is not equal to (i + 1), it means (i + 1) is the
                                        // smallest missing positive integer
                    return i + 1;
                }
            }

            return n + 1; // If all numbers from 1 to n are present, then the smallest missing positive
                          // integer is (n + 1)
        }
    }

}
