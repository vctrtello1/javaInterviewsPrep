package Arrays.KDiffPairsInAnArray;

import java.util.HashMap;
import java.util.Map;

public class Main {

    // Given an array of integers nums and an integer k, return the number of
    // unique k-diff pairs in the array.
    // A k-diff pair is an integer pair (nums[i], nums[j]), where the following are
    // true:
    // 0 <= i, j < nums.length
    // i != j
    // |nums[i] - nums[j]| == k

    public static void main(String[] args) {
        Solution solution = new Main().new Solution(); // Create an instance of the Solution class to call the method
        int[] nums = { 3, 1, 4, 1, 5 }; // Define the input array of integers
        int k = 2; // Define the value of k for which we want to find the k-diff pairs
        System.out.println(solution.findPairs(nums, k));
    }

    class Solution {
        public int findPairs(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>(); // Create a HashMap to store the frequency of each integer in
                                                         // the input array
            int count = 0;
            for (int i : nums) { // Loop through the input array and populate the HashMap with the frequency of
                                 // each integer
                map.put(i, map.getOrDefault(i, 0) + 1); // For each integer i in the input array, we update its count in
                                                        // the HashMap. If i is not already a key in the map, we
                                                        // initialize its count to 0 and then increment it by 1.
            }

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (k == 0) {
                    // count number of elements in the array, appear more than or equal twice.
                    if (entry.getValue() >= 2) { // If k is 0, we need to count the number of integers that appear at
                                                 // least twice in the array, as they form a valid k-diff pair with
                                                 // themselves
                        count++;
                    }
                } else {
                    if (map.containsKey(entry.getKey() + k)) { // If k is not 0, we need to check if there exists an
                                                               // integer in the array that forms a valid k-diff pair
                                                               // with the current integer
                        count++; // If the HashMap contains the key (current integer + k), it means we have found
                                 // a valid k-diff pair,
                                 // so we increment the count by 1
                    }
                }
            }

            return count;
        }
    }
}
