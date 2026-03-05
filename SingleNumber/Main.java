package SingleNumber;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {2, 2, 1};
        int result = main.singleNumber(nums);
        System.out.println(result);
    }
    // XOR operation has a property that a ^ a = 0 and a ^ 0 = a. Therefore, if we XOR all the numbers in the array, the pairs will cancel each other out, leaving us with the single number that appears only once.

    // Given a non-empty array of integers, every element appears twice except for one. Find that single one.
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
