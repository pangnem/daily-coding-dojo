import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int solution(String input1, String input2) {
        String input1ToLowerCase = input1.toLowerCase();

        return (int) Arrays.stream(input1ToLowerCase.split(""))
                .filter(input2.toLowerCase()::equals)
                .count();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        System.out.println(new Main().solution(input1, input2));
    }
}
