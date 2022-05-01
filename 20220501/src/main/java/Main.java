import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        System.out.println(new Main().solution(input1));
    }

    public String solution(String input1) {

        // 1. 문자를 문자 하나씩 쪼개기
        char[] chars = input1.toCharArray();

        // 2. 대문자는 소문자로, 소문자는 대문자로 변환
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
            } else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }

        List<String> strings = new ArrayList<>();
        for (char aChar : chars) {
            strings.add(Character.toString(aChar));
        }

        // 3. 문자열 합쳐서 리턴
        return String.join("", strings);
    }
}
