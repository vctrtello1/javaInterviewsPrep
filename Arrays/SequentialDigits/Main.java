package Arrays.SequentialDigits;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // An integer has sequential digits if and only if each digit in the number is
    // one more than the previous digit.
    // Return a sorted list of all the integers in the range [low, high] inclusive
    // that have sequential digits.

    public static void main(String[] args) {
        Solution solution = new Main().new Solution();
        int low = 100;
        int high = 300;
        System.out.println(solution.sequentialDigits(low, high));
    }

    class Solution {
        public List<Integer> sequentialDigits(int low, int high) {
            String digits = "123456789";

            List<Integer> result = new ArrayList<>(); // List to store the sequential digits within the specified range
            for (int length = 1; length <= 9; length++) {
                for (int i = 0; i + length <= digits.length(); i++) { // Loop through the digits string to extract
                                                                      // sequential digits of the specified length
                    String substring = digits.substring(i, i + length); // Extract a substring of the specified length
                                                                        // from the digits string
                    int value = Integer.parseInt(substring);

                    if (value >= low && value <= high) { // Check if the value is within the specified range
                        result.add(value);
                    }
                }
            }

            return result;
        }
    }
}
