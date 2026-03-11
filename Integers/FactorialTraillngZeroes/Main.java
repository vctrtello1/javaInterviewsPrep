package FactorialTraillngZeroes;

public class Main {

    // Given an integer n, return the number of trailing zeroes in n!.
    public static void main(String[] args) {
        Main main = new Main();
        int n = 100;
        int result = main.trailingZeroes(n);
        System.out.println(result);
    }

    // To count the number of trailing zeroes in n!, we need to count the number of
    // times 10 is a factor in the numbers from 1 to n. Since 10 is made of 2 and 5,
    // and there are usually more factors of 2 than 5 in a factorial, we can focus
    // on counting the number of factors of 5. The formula to calculate the number
    // of trailing zeroes is:
    // trailingZeroes(n) = n / 5 + n / 25 + n / 125 + ... until n / 5^k is 0.
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5; // Divide n by 5 to count the number of multiples of 5
            count += n; // Add the count of multiples of 5 to the total
        }
        return count;
    }
}
