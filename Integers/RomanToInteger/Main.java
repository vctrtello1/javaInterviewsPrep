package RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // Roman numerals are represented by seven different symbols: I, V, X, L, C, D
    // and M.
    // Symbol Value
    // I 1
    // V 5
    // X 10
    // L 50
    // C 100
    // D 500
    // M 1000
    // For example, 2 is written as II in Roman numeral, just two one's added
    // together. 12 is written as XII, which is simply X + II. The number 27 is
    // written as XXVII, which is XX + V + II.
    // Roman numerals are usually written largest to smallest from left to right.
    // However, the numeral for four is not IIII. Instead, the number four is
    // written as IV. Because the one is before the five we subtract it making four.
    // The same principle applies to the number nine, which is written as IX. There
    // are six instances where subtraction is used:
    // I can be placed before V (5) and X (10) to make 4 and 9.
    // X can be placed before L (50) and C (100) to make 40 and 90.

    // C can be placed before D (500) and M (1000) to make 400 and 900.
    public static void main(String[] args) {
        Main main = new Main();
        String s = "MCMXCIV";
        int result = main.romanToInt(s);
        System.out.println(result); // Output: 1994

    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(); // Create a HashMap to store the integer values corresponding to
                                                       // each Roman numeral character
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) { // If the current character's value is
                                                                                // less than the next character's value,
                                                                                // it means we have encountered a
                                                                                // subtraction case (e.g., IV, IX,
                                                                                // etc.). In this case, we subtract the
                                                                                // current character's value from the
                                                                                // result. Otherwise, we simply add the
                                                                                // current character's value to the
                                                                                // result. This logic correctly handles
                                                                                // both the standard cases (where we add
                                                                                // values) and the special subtraction
                                                                                // cases in Roman numerals.
                result -= map.get(s.charAt(i)); // Subtract the value of the current character from the result in
                                                // subtraction cases (e.g., IV, IX, etc.)
            } else {
                result += map.get(s.charAt(i)); // Add the value of the current character to the result in standard
                                                // cases (where we simply add values)
            }
        }
        return result;
    }

}
