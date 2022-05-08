import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        System.out.println(new Main().solution(input1));
    }

    public String solution(String input1) {
        input1 = input1.replaceAll("[^a-zA-Z]", "");
        String tmp = new StringBuilder(input1).reverse().toString();
        if (input1.equalsIgnoreCase(tmp)) {
            return "YES";
        }

        return "NO";
    }
}
