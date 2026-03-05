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
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        // Convert the number to a string and check if it reads the same backward and forward
        String str = String.valueOf(x); // Convert the integer to a string
        String reversedStr = new StringBuilder(str).reverse().toString(); // Reverse the string to compare with the original
        return str.equals(reversedStr);
    }
}


