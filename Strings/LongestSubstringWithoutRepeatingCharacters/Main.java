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
            char currentChar = s.charAt(right);
            if (!visited[currentChar]) {
                visited[currentChar] = true;
                right++;
                maxLength = Math.max(maxLength, right - left);
            } else {
                visited[s.charAt(left)] = false;
                left++;
            }
        }

        return maxLength;
    }
    
}
