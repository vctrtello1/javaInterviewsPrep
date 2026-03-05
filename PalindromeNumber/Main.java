package PalindromeNumber;

// A palindrome number is a number that reads the same backward as forward. For example, 121 is a palindrome while 123 is not.

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int x = 121;
        boolean result = main.isPalindrome(x);
        System.out.println(result);
    }

    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (except 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) { // Check for negative numbers and numbers ending with 0 
            return false; 
        }
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        // For even length, x == reversed; for odd length, x == reversed/10
        return x == reversed || x == reversed / 10;
    }
}


