package FizzBuzzHackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    public static void main(String[] args) throws IOException {
        int n = readInput(args);
        fizzBuzz(n).forEach(System.out::println);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }

        return result;
    }

    private static int readInput(String[] args) throws IOException {
        if (args.length > 0) {
            return Integer.parseInt(args[0]);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Read from standard input if no
                                                                                      // command-line argument is
                                                                                      // provided
        if (reader.ready()) { // Check if there is input available to read
            String line = reader.readLine(); // Read a line from standard input
            if (line != null && !line.trim().isEmpty()) { // Check if the line is not null and not empty
                return Integer.parseInt(line.trim());
            }
        }

        return 15;
    }
}
