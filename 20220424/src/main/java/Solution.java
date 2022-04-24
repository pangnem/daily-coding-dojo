import java.util.Scanner;
import java.util.stream.IntStream;

class Solution {
    public static void main(String[] args) {
//        solution1();
        solution2();
    }

    private static void solution1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntStream.range(0, b)
                .forEach(i -> {
                    IntStream.range(0, a)
                            .forEach(j -> System.out.print("*"));

                    System.out.println();
                });
    }

    // 다른사람의 풀이
    private static void solution2() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        IntStream.range(0, a).forEach(s -> stringBuilder.append("*"));
        IntStream.range(0, b).forEach(s -> System.out.println(stringBuilder));
    }
}
