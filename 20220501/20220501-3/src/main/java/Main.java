import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        String[] input2 = new String[input1];
        for (int i = 0; i < input1; i++) {
            input2[i] = in.next();
        }

        System.out.println(new Main().solution(input1, input2));
    }

    public String solution(int wordCount, String[] strings) {
        StringBuilder mainStringBuilder = new StringBuilder();

        for (int i = 0; i < wordCount; i++) {
            mainStringBuilder.append(new StringBuilder(strings[i]).reverse());
            mainStringBuilder.append("\n");
        }

        return mainStringBuilder.toString();
    }
}
