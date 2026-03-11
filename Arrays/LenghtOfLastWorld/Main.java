package Arrays.LenghtOfLastWorld;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String s = "Hello World";
        int result = main.lengthOfLastWord(s);
        System.out.println(result); // Output: 5
    }

    public int lengthOfLastWord(String s) {
        int count = 0;
        // We are looking for the last word so let's go backward
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                count++;
            } else { // it's a white space instead
                // Did we already started to count a word ? Yes so we found the last word
                if (count > 0)
                    return count;
            }
        }
        return count;
    } 
}
