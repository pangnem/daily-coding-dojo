import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

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
            if (aChar != ')') {
                stack.push(aChar);
                continue;
            }

            while(true) {
                char poped = stack.pop();
                if (poped == '(') {
                    break;
                }
            }
        }

        return stack.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));
    }

}
