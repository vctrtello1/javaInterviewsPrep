package LongestCommonPrefix;

public class Main {
    // Write a function to find the longest common prefix string amongst an array of
    // strings.
    // If there is no common prefix, return an empty string "".

    public static void main(String[] args) {
        Main main = new Main();
        String[] strs = { "flower", "flow", "flight" };
        String result = main.longestCommonPrefix(strs);
        System.out.println(result); // Output: "fl"
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) { // Check if the input array is null or empty. If it is, there is no
                                                // common prefix, so we return an empty string. This is a base case to
                                                // handle edge cases where the input might not contain any strings.
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Check if the current string starts with the prefix. If it does
                                                   // not, we need to shorten the prefix until we find a common prefix
                                                   // or determine that there is no common prefix.
                prefix = prefix.substring(0, prefix.length() - 1); // Shorten the prefix by removing the last character.
                                                                   // We keep doing this until we find a common prefix
                                                                   // or the prefix becomes empty.
                if (prefix.isEmpty()) { // If the prefix is empty, there is no common prefix
                    return ""; // Return an empty string as there is no common prefix
                }
            }
        }
        return prefix;
    }

}
