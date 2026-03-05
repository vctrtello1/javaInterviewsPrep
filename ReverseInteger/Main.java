package ReverseInteger;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int x = 123;
        int result = main.reverse(x);
        System.out.println(result);
    }

    // To reverse an integer, we can repeatedly take the last digit of the number and build the reversed number. We also need to handle cases where the reversed integer might overflow.

    // Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
    public int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int pop = x % 10; // Get the last digit
            x /= 10; // Remove the last digit
            // Check for overflow before actually adding the digit
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // Overflow case for positive numbers
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // Overflow case for negative numbers
            }
            reversed = reversed * 10 + pop; // Append the digit to the reversed number
        }
        return reversed;
    }
}
