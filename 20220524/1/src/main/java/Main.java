import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        System.out.println(new Main().solution(input1));
    }

    public String solution(String input1) {
        char[] chars = input1.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            if (!Character.isAlphabetic(aChar)) {
                stringBuilder.append(aChar);
            }
        }

        return String.valueOf(Integer.parseInt(stringBuilder.toString()));
    }

    public String solution2(String input1) {
        String collect = input1.chars()
                .mapToObj(i -> (char) i)
                .filter(it -> !Character.isAlphabetic(it))
                .map(String::valueOf)
                .collect(Collectors.joining(""));

        return String.valueOf(Integer.parseInt(collect));
    }
}
