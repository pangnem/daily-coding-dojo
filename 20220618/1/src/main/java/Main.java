import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.println(new Main().solution(input1));
    }

    private String solution(String input1) {
        Stack<Character> stack = new Stack<>();

        char[] chars = input1.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push(aChar);
                continue;
            }

            if (aChar == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                }

                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return "YES";
        }

        return "NO";
    }

}
