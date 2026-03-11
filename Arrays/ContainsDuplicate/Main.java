package Arrays.ContainsDuplicate;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {1, 2, 3, 1};
        boolean result = main.containsDuplicate(nums);
        System.out.println(result); // Output: true
    }

    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
