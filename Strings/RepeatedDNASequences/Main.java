
package RepeatedDNASequences;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {
    // All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T,
    // for example: "ACGAATTCCG". When studying DNA, it is useful to identify
    // repeated sequences within the DNA.
    // Write a function to find all the 10-letter-long sequences (substrings) that
    // occur more than once in a DNA molecule.

    public static void main(String[] args) {
        Main main = new Main();
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"; // Example input string representing a DNA sequence
        System.out.println(main.findRepeatedDnaSequences(s)); // Output: ["AAAAACCCCC", "CCCCCAAAAA"]
    }

    public List<String> findRepeatedDnaSequences(String s) { // The function takes a string s as input, which represents
                                                             // a DNA sequence. The goal is to find all 10-letter-long
                                                             // substrings that occur more than once in the given DNA
                                                             // sequence. We will use two HashSet collections to keep
                                                             // track of the substrings we have seen and the substrings
                                                             // that are repeated. We iterate through the string,
                                                             // extracting each 10-letter-long substring and checking if
                                                             // it has been seen before. If it has, we add it to the
                                                             // repeated set. Finally, we return a list of the repeated
                                                             // substrings.
        Set<String> seen = new HashSet<>(); // HashSet to keep track of substrings we have seen so far
        Set<String> repeated = new HashSet<>(); // HashSet to keep track of substrings that are repeated
        for (int i = 0; i <= s.length() - 10; i++) { // Loop through the string, extracting each 10-letter-long
                                                     // substring. We loop until s.length() - 10 to ensure we only
                                                     // extract valid 10-letter-long substrings.
            String substring = s.substring(i, i + 10);
            if (!seen.add(substring)) { // If add returns false, it means the substring was already seen
                repeated.add(substring); // Add the substring to the repeated set if it has been seen before
            }
        }
        return new ArrayList<>(repeated);
    }

}
