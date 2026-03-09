package ValidAnagram;

public class Main {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {

        // If the lengths of the strings are different, they cannot be anagrams and we
        // can return false immediately.
        // We create an integer array of size 26 to count the occurrences of each
        // character in the strings.
        // We iterate through both strings simultaneously, incrementing the count for
        // characters in string s and decrementing the count for characters in string t.
        // Finally, we check if all counts are zero. If any count is not zero, it means
        // that the strings are not anagrams, and we return false. If all counts are
        // zero, we return true,
        // indicating that the strings are anagrams of each other.
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26]; // Assuming the strings consist of lowercase English letters only
        for (int i = 0; i < s.length(); i++) { // Iterate through both strings simultaneously
            count[s.charAt(i) - 'a']++; // Increment the count for characters in string s
            count[t.charAt(i) - 'a']--; // Decrement the count for characters in string t
        }
        for (int i : count) { // Check if all counts are zero
            if (i != 0) { // If any count is not zero, the strings are not anagrams
                return false; // Return false if the strings are not anagrams
            }
        }
        return true; // Return true if all counts are zero, indicating that the strings are anagrams
                     // of each other
                     // This implementation has a time complexity of O(n), where n is the length of
                     // the strings, and a space complexity of O(1) since the count array has a fixed
                     // size of 26.
    }
}
