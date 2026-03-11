package ReverseWordsInAString;

public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        String result = reverseWords(s);
        System.out.println(result); // Output: "World Hello"
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // Split the string into words, handling multiple spaces
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) { // Loop through the words array in reverse order to build the
                                                      // reversed string
            reversed.append(words[i]);
            if (i != 0) { // Add a space between words, but not after the last word
                reversed.append(" "); // Append a space after each word except the last one to ensure the final string
                                      // is properly formatted without trailing spaces
            }
        }
        return reversed.toString();
    }

}
