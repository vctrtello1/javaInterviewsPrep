package ReverseString;

public class Main {
    // Write a function that reverses a string. The input string is given as an array of characters char[].
    // Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
    // You may assume all the characters consist of printable ascii characters.
    public static void main(String[] args) {
        Main main = new Main();
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        main.reverseString(s);
        System.out.println(s); // Output: "olleh"

    }

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
