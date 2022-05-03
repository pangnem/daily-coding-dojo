import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        System.out.println(new Main().solution(input1));
    }

    public String solution(String input1) {
        return Arrays.stream(input1.split(""))
                .distinct()
                .collect(Collectors.joining(""));
    }

}
