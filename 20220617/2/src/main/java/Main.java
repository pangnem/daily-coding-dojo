import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input1 = in.nextInt();

		new Main().solution(input1);
	}

	private void solution(int input1) {
        int int1 = 1;
        System.out.print(int1 + " ");
        int int2 = 1;
        System.out.print(int2 + " ");

        for (int i = 2; i < input1; i++) {
			int sum = int1 +int2;
			System.out.print(sum + " ");

			int1=int2;
			int2=sum;
        }
	}

}
