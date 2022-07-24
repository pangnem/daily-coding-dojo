import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}

		int m = in.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < m; i++) {
			b[i] = in.nextInt();
		}

		String solution = solution(n, a, m, b);
		System.out.println(solution);
	}

	private static String solution(int n, int[] a, int m, int[] b) {
		int nPoint = 0, mPoint = 0;

		Arrays.sort(a);
		Arrays.sort(b);

		List<Integer> answer = new ArrayList<>();

		while ((nPoint < n) && (mPoint < m)) {

			int aValue = a[nPoint];
			int bValue = b[mPoint];

			if (aValue < bValue) {
				nPoint++;
				continue;
			} else if (aValue > bValue) {
				mPoint++;
				continue;
			}

			answer.add(aValue);
			nPoint++;
			mPoint++;
		}

		return answer.stream()
				.map(Object::toString)
				.collect(joining(" "));
	}
}
