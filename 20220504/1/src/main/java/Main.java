import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        System.out.println(new Main().solution(input1));
    }

    public String solution(String input1) {
        char[] chars = input1.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[chars.length - 1 - i])) {
                return "NO";
            }
        }

        return "YES";
    }
}
