package Arrays.SimpleMatrixSummation;

import java.util.ArrayList;
import java.util.List;

// Complete the 'findMatrix' function below. 
// The function is expected to return a 2D_INTEGER_ARRAY.
// The function accepts 2D_INTEGER_ARRAY a as parameter.    
public class Solution {
    public static List<List<Integer>> findMatrix(List<List<Integer>> a) { // Write your code here
        int n = a.size(); // number of rows
        int m = a.get(0).size(); // number of columns

        List<List<Integer>> b = new ArrayList<>(); // result matrix
        for (int i = 0; i < n; i++) { // iterate through rows
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) { // iterate through columns
                int val = a.get(i).get(j); // start with the current value
                if (j > 0)
                    val += b.get(i).get(j - 1); // add the value from the left cell in the result matrix
                if (i > 0)
                    val += b.get(i - 1).get(j); // add the value from the above cell in the result matrix
                if (i > 0 && j > 0)
                    val -= b.get(i - 1).get(j - 1); // subtract the value from the top-left cell to avoid double
                                                    // counting
                row.add(val); // add the computed value to the current row of the result matrix
            }
            b.add(row); // add the computed row to the result matrix
        }
        return b;
    }

    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>();
        a.add(List.of(1, 2));
        a.add(List.of(3, 4));

        List<List<Integer>> result = findMatrix(a);
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}