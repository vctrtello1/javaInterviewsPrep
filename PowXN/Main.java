package PowXN;

public class Main {
    // Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).
    public static void main(String[] args) {
        Main main = new Main();
        double x = 2.0;
        int n = 10;
        double result = main.myPow(x, n);
        System.out.println(result);
    }

    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1;
        while (n > 0) {
            if (n % 2 == 1) result *= x;
            x *= x;
            n /= 2;
        }
        return result;
    }
}
