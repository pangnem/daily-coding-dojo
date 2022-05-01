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

    public String solution2(int wordCount, String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            String string = strings[i];
            char[] chars = string.toCharArray();

            int lt = 0;
            int rt = chars.length - 1;
            while (lt <= rt) {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;

                lt++;
                rt--;
            }

            stringBuilder.append(String.valueOf(chars));
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }

}
