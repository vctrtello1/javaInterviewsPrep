package PowXN;

public class Main {
    // Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
    public static void main(String[] args) {
        Main main = new Main();
        double x = 8.0;
        int n = 4;
        double result = main.myPow(x, n);
        System.out.println(result);
    }

    public double myPow(double x, int n) { // Handle the case when n is 0, as any number raised to the power of 0 is 1
        if (n == 0)
            return 1;
        if (n < 0) { // If n is negative, we can convert the problem to a positive exponent by taking
                     // the reciprocal of x and negating n to make it positive (e.g., x^-n = 1/x^n).
                     // This allows us to use the same logic for positive exponents to calculate the
                     // result. This is a common technique to simplify the implementation of the
                     // power function and avoid dealing with negative exponents separately.
            x = 1 / x; // Take the reciprocal of x to handle negative exponent case (e.g., x^-n =
                       // 1/x^n)
            n = -n; // Negate n to make it positive for the subsequent calculations (e.g., x^-n =
                    // 1/x^n)
        }
        double result = 1;
        while (n > 0) {
            if (n % 2 == 1)
                result *= x; // If n is odd, multiply the result by the current value of x to account for the
                             // odd exponent (we will handle the even part of the exponent in the next step)
            x *= x; // Square the base for the next iteration to handle the even part of the
                    // exponent
            n /= 2; // Divide the exponent by 2 for the next iteration
        }
        return result;
    }
}
