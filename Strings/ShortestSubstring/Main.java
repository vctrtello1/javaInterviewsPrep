package ShortestSubstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s = reader.readLine();

		if (s == null) {
			return;
		}

		System.out.println(findShortestSubstring(s.trim()));
	}

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
