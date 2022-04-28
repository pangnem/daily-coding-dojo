import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);

        System.out.println(new Main().solution(input1, input2));
    }

    public int solution(String input1, char input2) {
        int count = 0;
        for (char input1Char : input1.toLowerCase().toCharArray()) {
            if (input1Char == Character.toLowerCase(input2)) {
                count++;
            }
        }

        return count;
    }
}
