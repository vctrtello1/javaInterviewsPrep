package Arrays.RansomNote;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String ransomNote = "a";
        String magazine = "b";
        boolean result = main.canConstruct(ransomNote, magazine);
        System.out.println(result); // Output: false
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];
        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false;
            }
            charCount[c - 'a']--;
        }
        return true;
    }
    
}
