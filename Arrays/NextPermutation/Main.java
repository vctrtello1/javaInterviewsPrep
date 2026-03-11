package Arrays.NextPermutation;

public class Main {

    // Implement next permutation, which rearranges numbers into the
    // lexicographically next greater permutation of numbers.
    // If such an arrangement is not possible, it must rearrange it as the lowest
    // possible order (i.e., sorted in ascending order).
    // The replacement must be in place and use only constant extra memory.

    public static void main(String[] args) {
        Solution solution = new Main().new Solution();
        int[] nums = { 1, 2, 3 };
        solution.nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    class Solution {
        public void nextPermutation(int[] nums) { // Find the rightmost pair of indices (i, i + 1) such that nums[i] <
                                                  // nums[i + 1]. If no such pair exists, the array is in descending
                                                  // order, and we need to reverse it to get the lowest order.
            int i = nums.length - 2;
            while (i >= 0 && nums[i] >= nums[i + 1]) { // Move leftwards to find the first pair of indices where the
                                                       // left number is smaller than the right number
                i--;
            }
            if (i >= 0) {
                int j = nums.length - 1;
                while (nums[j] <= nums[i]) { // Move rightwards to find the first number that is greater than nums[i]
                    j--;
                }
                swap(nums, i, j);
            }
            reverse(nums, i + 1);
        }

        private void swap(int[] nums, int i, int j) { // Swap the numbers at indices i and j
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        private void reverse(int[] nums, int start) { // Reverse the subarray from index start to the end of the array
                                                      // to get the next permutation in place
            int left = start; // Initialize left pointer to the start index of the subarray to be reversed
            int right = nums.length - 1; // Initialize right pointer to the end index of the array
            while (left < right) { // Loop until the left pointer is less than the right pointer
                swap(nums, left, right);
                left++;
                right--;
            }
        }
    }

}
