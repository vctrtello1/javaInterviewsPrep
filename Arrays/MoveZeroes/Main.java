package Arrays.MoveZeroes;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {0, 1, 0, 3, 12};
        main.moveZeroes(nums);
        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: 1 3 12 0 0
    }

    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt++;
            }
        }
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    
}
