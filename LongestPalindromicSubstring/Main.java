package LongestPalindromicSubstring;

public class Main {
    // The longestPalindrome method takes a string s as input and returns the
    // longest palindromic substring within s.
    // It uses a helper method expandAroundCenter to expand around potential centers
    // of palindromes in the string.

    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) { // If the input string is null or empty, we return an empty string as there
                                           // are no palindromic substrings.
            return "";
        }
        int start = 0, end = 0; // We initialize two variables, start and end, to keep track of the starting and
                                // ending indices of the longest palindromic substring found so far.
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length palindromes
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindromes
            int len = Math.max(len1, len2); // We calculate the length of the longest palindrome centered at index i by
                                            // taking the maximum of len1 and len2.
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) { // We expand around the center as
                                                                                       // long as the characters at the
                                                                                       // left and right indices are
                                                                                       // equal and within the bounds of
                                                                                       // the string.
            left--; // Move left pointer to the left
            right++; // Move right pointer to the right
        }
        return right - left - 1; // Length of the palindrome
    }

}
