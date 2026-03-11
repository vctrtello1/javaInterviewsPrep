package Arrays.JumpGame;

public class Main {
    
    // Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
    // Each element in the array represents your maximum jump length at that position.
    // Determine if you are able to reach the last index.

    public static void main(String[] args) {
        Solution solution = new Main().new Solution();
        int[] nums = {2, 3, 1, 1, 4};
        boolean result = solution.canJump(nums);
        System.out.println(result);
    }

    class Solution {
        public boolean canJump(int[] nums) {
            int maxReachable = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i > maxReachable) {
                    return false;
                }
                maxReachable = Math.max(maxReachable, i + nums[i]);
            }
            return true;
        }
    }
    
}
