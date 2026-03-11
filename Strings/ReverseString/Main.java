package ReverseString;

public class Main {
    // Write a function that reverses a string. The input string is given as an
    // array of characters char[].
    // Do not allocate extra space for another array, you must do this by modifying
    // the input array in-place with O(1) extra memory.
    // You may assume all the characters consist of printable ascii characters.
    public static void main(String[] args) {
        Main main = new Main();
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        main.reverseString(s);
        System.out.println(s); // Output: "olleh"

    }

    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1; // We initialize two pointers, left and right, to the start and end of the
                                            // array, respectively. We will use these pointers to swap characters until
                                            // they meet in the middle.
        while (left < right) { // We continue swapping characters until the left pointer is less than the right
                               // pointer. This ensures that we only swap characters once and do not overwrite
                               // any characters in the process.
            char temp = s[left]; // We store the character at the left pointer in a temporary variable to avoid
                                 // losing it during the swap.
            s[left] = s[right]; // We assign the character at the right pointer to the left pointer, effectively
                                // moving the character from the end of the array to the beginning.
            s[right] = temp; // We assign the character stored in the temporary variable (originally at the
                             // left pointer) to the right pointer, effectively moving the character from the
                             // beginning of the array to the end.
            left++; // We move the left pointer to the right to prepare for the next swap.
            right--; // We move the right pointer to the left to prepare for the next swap. This
                     // process continues until the left and right pointers meet, at which point the
                     // array has been fully reversed.
        }
    }
}
