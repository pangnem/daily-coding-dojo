import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        System.out.println(new Main().solution(input1));
    }

    public String solution(String input1) {
        char[] chars = input1.toCharArray();

        int lt = 0;
        int rt = chars.length - 1;
        while (lt <= rt) {
            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
                continue;
            }

            if (!Character.isAlphabetic(chars[rt])) {
                rt--;
                continue;
            }

            swap(chars, lt, rt);
            lt++;
            rt--;
        }

        return String.valueOf(chars);
    }

    private void swap(char[] chars, int lt, int rt) {
        char temp = chars[lt];
        chars[lt] = chars[rt];
        chars[rt] = temp;
    }
}
