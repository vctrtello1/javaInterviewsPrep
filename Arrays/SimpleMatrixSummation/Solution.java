package Arrays.SimpleMatrixSummation;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static List<List<Integer>> findMatrix(List<List<Integer>> a) {
        int n = a.size();
        int m = a.get(0).size();

        List<List<Integer>> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                int val = a.get(i).get(j);
                if (j > 0) val += b.get(i).get(j - 1);
                if (i > 0) val += b.get(i - 1).get(j);
                if (i > 0 && j > 0) val -= b.get(i - 1).get(j - 1);
                row.add(val);
            }
            b.add(row);
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