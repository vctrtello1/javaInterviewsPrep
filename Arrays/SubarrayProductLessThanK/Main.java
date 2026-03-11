package Arrays.SubarrayProductLessThanK;

public class Main {

    // Given an array of integers nums and an integer k, return the number of
    // contiguous subarrays where the product of all the elements in the subarray is
    // strictly less than k.

    public static void main(String[] args) {
        Solution solution = new Main().new Solution();
        int[] nums = { 10, 5, 2, 6 };
        int k = 100;
        System.out.println(solution.numSubarrayProductLessThanK(nums, k));
    }

    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) { // If k is less than or equal to 1, there can be no
                                                                    // subarrays with a product less than k
            if (k <= 1)
                return 0; // nums = [1], k = 1
            int count = 0;
            int left = 0;
            int prod = 1;
            for (int i = 0; i < nums.length; i++) { // Loop through the input array to calculate the product of the
                                                    // current subarray and count the valid subarrays
                prod *= nums[i];
                while (prod >= k) { // If the product of the current subarray is greater than or equal to k, move
                                    // the left pointer to the right and update the product accordingly to find a
                                    // valid subarray
                    prod /= nums[left++]; // Move the left pointer to the right and update the product by dividing it by
                                          // the value at the left pointer to find a valid subarray
                }
                count += i - left + 1; // The number of valid subarrays that end at index i is equal to the length of
                                       // the current valid subarray, which is (i - left + 1)
            }
            return count;
        }
    }

}
