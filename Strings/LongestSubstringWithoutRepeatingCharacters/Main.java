package LongestSubstringWithoutRepeatingCharacters;

public class Main {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int right = 0;
        int n = s.length();
        boolean[] visited = new boolean[256]; // Assuming ASCII character set

        while (right < n) {
            char currentChar = s.charAt(right); // Get the current character at the right pointer to check if it has
                                                // been visited before in the current substring defined by the left and
                                                // right pointers
            if (!visited[currentChar]) { // If the current character has not been visited, we can safely include it in
                                         // the current substring and move the right pointer to the right to expand the
                                         // substring. We also mark the current character as visited in the boolean
                                         // array and update the maximum length of the substring if necessary.
                visited[currentChar] = true;
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                visited[s.charAt(left)] = false; // If the current character has been visited, it means we have a
                                                 // repeating character in the current
                                                 // substring. To remove the repeating character, we move the left
                                                 // pointer to
                                                 // the right and mark the character at the left pointer as not visited
                                                 // in the
                                                 // boolean array. We keep doing this until we have removed the
                                                 // repeating
                                                 // character from the current substring, allowing us to include the
                                                 // current
                                                 // character at the right pointer in the next iteration of the loop.
                left++; // Move the left pointer to the right to shrink the substring and remove the
                        // repeating character from the current substring defined by the left and right
                        // pointers so that we can include the current character at the right pointer in
                        // the next iteration of the loop
            }
        }

        return maxLength;
    }

}
