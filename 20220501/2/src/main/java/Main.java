import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.println(new Main().solution(input1));
    }

    public String solution(String string) {
        String[] strings = string.split(" ");

        int maxLength = Arrays.stream(strings)
                .map(String::length)
                .max(Comparator.comparingInt(it -> it))
                .orElse(0);

        return Arrays.stream(strings)
                .filter(it -> it.length() == maxLength)
                .findFirst()
                .orElse("");
    }

    public String solution2(String string) {
        String maxLengthWord = "";
        while (string.contains(" ")) {
            String forWardWord = string.substring(0, string.indexOf(" "));
            if (forWardWord.length() > maxLengthWord.length()) {
                maxLengthWord = forWardWord;
            }

            string = string.substring(string.indexOf(" ") + 1);
        }

        if (string.length() > maxLengthWord.length()) {
            return string;
        }

        return maxLengthWord;
    }
}
