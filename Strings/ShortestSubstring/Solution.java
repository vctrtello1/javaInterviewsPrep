package ShortestSubstring;
import java.io.*;

class Result {
    /*
     * Complete the 'findShortestSubstring' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int findShortestSubstring(String s) {
        int n = s.length();
        boolean[] suffixSeen = new boolean[26];
        int right = n;

        while (right > 0) {
            int current = s.charAt(right - 1) - 'a';
            if (suffixSeen[current]) {
                break;
            }
            suffixSeen[current] = true;
            right--;
        }

        int answer = right;
        boolean[] prefixSeen = new boolean[26];

        for (int left = 0; left < n; left++) {
            int current = s.charAt(left) - 'a';
            if (prefixSeen[current]) {
                break;
            }

            prefixSeen[current] = true;

            while (right < n && suffixSeen[current]) {
                suffixSeen[s.charAt(right) - 'a'] = false;
                right++;
            }

            answer = Math.min(answer, right - left - 1);
        }

        return answer;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String s = bufferedReader.readLine();
        int result = Result.findShortestSubstring(s);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}




