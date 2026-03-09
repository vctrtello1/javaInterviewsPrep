
package RepeatedDNASequences;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    // All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is useful to identify repeated sequences within the DNA.
    // Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

    public static void main(String[] args) {
        Main main = new Main();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(main.findRepeatedDnaSequences(s)); // Output: ["AAAAACCCCC", "CCCCCAAAAA"]
    }

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String substring = s.substring(i, i + 10);
            if (!seen.add(substring)) { // If add returns false, it means the substring was already seen
                repeated.add(substring);
            }
        }
        return new ArrayList<>(repeated);
    }
    
}
