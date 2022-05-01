import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        System.out.println(new Main().solution(input1));
    }

    public String solution(String input1) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : input1.toCharArray()) {
            if (Character.isLowerCase(aChar)) {
                stringBuilder.append(Character.toUpperCase(aChar));
            } else {
                stringBuilder.append(Character.toLowerCase(aChar));
            }
        }

        return stringBuilder.toString();
    }

    /*
        아스키 코드를 활용한 풀이
     */
    public String solution2(String input1) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : input1.toCharArray()) {
            if (aChar >= 65 && aChar <= 90) {
                stringBuilder.append((char) (aChar + 32));
            } else {
                stringBuilder.append((char) (aChar - 32));
            }
        }

        return stringBuilder.toString();
    }
}
