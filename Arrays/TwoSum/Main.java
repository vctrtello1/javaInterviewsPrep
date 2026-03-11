package Arrays.TwoSum;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = main.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                return new int[] {map.get(complement) ,i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
}
