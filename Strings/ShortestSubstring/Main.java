package ShortestSubstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line = reader.readLine();

		if (line == null) {
			return;
		}

		String s = line.trim();
		System.out.println(findShortestSubstring(s));
	}

	public static int findShortestSubstring(String s) {
		int n = s.length();
		boolean[] suffixPresent = new boolean[26];
		int right = n;

		while (right > 0) {
			int index = s.charAt(right - 1) - 'a';
			if (suffixPresent[index]) {
				break;
			}
			suffixPresent[index] = true;
			right--;
		}

		int shortestLength = right;
		boolean[] prefixPresent = new boolean[26];

		for (int left = 0; left < n; left++) {
			int index = s.charAt(left) - 'a';
			if (prefixPresent[index]) {
				break;
			}

			prefixPresent[index] = true;

			while (right < n && suffixPresent[index]) {
				suffixPresent[s.charAt(right) - 'a'] = false;
				right++;
			}

			shortestLength = Math.min(shortestLength, Math.max(0, right - left - 1));
		}

		return shortestLength;
	}
}
