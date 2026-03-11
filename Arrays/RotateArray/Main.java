package Arrays.RotateArray;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        main.rotate(nums, k);
        System.out.print("Output: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        // Output: 5 6 7 1 2 3 4
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
}
