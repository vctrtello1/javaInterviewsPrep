package Arrays.SimpleMatrixSummation;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static List<List<Integer>> findMatrix(List<List<Integer>> a) {
        int n = a.size();
        int m = a.get(0).size();
        List<List<Integer>> b = new ArrayList<>();

        // Inicializar matriz b
        for (int i = 0; i < n; i++) {
            b.add(new ArrayList<>());
            for (int j = 0; j < m; j++) {
                b.get(i).add(0);
            }
        }

        // Calcular suma acumulativa
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                int sum = 0;
                for (int i = 0; i <= x; i++) {
                    for (int j = 0; j <= y; j++) {
                        sum += a.get(i).get(j);
                    }
                }
                b.get(x).set(y, sum);
            }
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