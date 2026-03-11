package IntegerToRoman;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int num = 1994;
        String result = main.intToRoman(num);
        System.out.println(result); // Output: MCMXCIV
    }

    public String intToRoman(int num) { // The integer is guaranteed to be within the range from 1 to 3999.
        StringBuilder sb = new StringBuilder(); // StringBuilder is more efficient for string concatenation in a loop
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        for (int i = 0; i < values.length; i++) { // Loop through the values and symbols arrays
            while (num >= values[i]) { // For each value, we check if the input number is greater than or equal to the
                                       // current value in the values array. If it is, we append the corresponding
                                       // symbol to the StringBuilder and subtract the value from the input number. We
                                       // repeat this process until the input number is less than the current value, at
                                       // which point we move on to the next value in the array.
                sb.append(symbols[i]);
                num -= values[i];
            }
        }
        return sb.toString();
    }
}
