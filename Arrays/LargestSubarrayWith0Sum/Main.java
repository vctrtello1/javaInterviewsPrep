package Arrays.LargestSubarrayWith0Sum;

public class Main {

    // Given an array of integers, find the length of the longest subarray whose
    // sum is zero.

    public static void main(String[] args) {
        Solution solution = new Main().new Solution();
        int[] nums = { 1, -1, 3, 2, -2, -3 };
        System.out.println(solution.maxLen(nums));
    }

    class Solution {
        public int maxLen(int[] nums) {
            int maxLength = 0;
            int sum = 0;
            java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>(); // HashMap to store the cumulative sum
                                                                                 // and its corresponding index

            for (int i = 0; i < nums.length; i++) {
                sum += nums[i]; // Update the cumulative sum

                if (sum == 0) { // If the cumulative sum is zero, update the maximum length
                    maxLength = i + 1;
                } else if (map.containsKey(sum)) { // If the cumulative sum has been seen before, calculate the length
                                                   // of
                                                   // the subarray and update the maximum length
                    maxLength = Math.max(maxLength, i - map.get(sum));
                } else {
                    map.put(sum, i); // Store the cumulative sum and its corresponding index in the HashMap
                }
            }

            return maxLength; // Return the length of the longest subarray with sum zero
        }
    }
}
