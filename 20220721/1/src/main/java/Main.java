import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

		List<Integer> integers = new ArrayList<>();
		while ((nPoint < n) && (mPoint < m)) {

			// nPoint 와 mPoint 비교
            if (a[nPoint] < b[mPoint]) {
				integers.add(a[nPoint]);
				nPoint++;
			} else {
				integers.add(b[mPoint]);
				mPoint++;
			}
		}

        if (nPoint == n) {
            // 배열의 n부터 끝까지
            for (int i = mPoint; i < m; i++) {
                integers.add(b[i]);
            }
        } else {
            for (int i = nPoint; i < n; i++) {
                integers.add(a[i]);
            }
        }

        return integers.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" "));
	}
}
