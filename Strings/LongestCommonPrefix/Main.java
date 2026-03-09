package LongestCommonPrefix;

public class Main {
    // Write a function to find the longest common prefix string amongst an array of strings.
    // If there is no common prefix, return an empty string "".

    public static void main(String[] args) {
        Main main = new Main();
        String[] strs = {"flower", "flow", "flight"};
        String result = main.longestCommonPrefix(strs);
        System.out.println(result); // Output: "fl"
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // Check if the current string starts with the prefix
                prefix = prefix.substring(0, prefix.length() - 1); // Shorten the prefix
                if (prefix.isEmpty()) { // If the prefix is empty, there is no common prefix
                    return "";
                }
            }
        }
        return prefix;
    }
    
}
