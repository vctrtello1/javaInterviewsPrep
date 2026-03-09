package BinarySearch.BinarySearch;

public class Main {
    // Write a function that takes in a sorted array of integers and a target integer. The function should use the Binary Search algorithm to determine if the target integer is present in the array. If it is, return its index. If it is not, return -1.

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = main.binarySearch(nums, target);
        System.out.println(result); // Output: 4
    }

    public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoids potential overflow

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }
    
}
