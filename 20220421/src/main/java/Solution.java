import java.util.stream.IntStream;

public class Solution {
    public int solution(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int divisorCount = getDivisorCount(i);

            result = getResult(result, i, divisorCount);
        }

        return result;
    }

    private int getResult(int result, int i, int divisorCount) {
        if (divisorCount % 2 == 0) {
            result += i;
        }

        if (divisorCount % 2 != 0) {
            result -= i;
        }

        return result;
    }

    private int getDivisorCount(int number) {
        return (int) IntStream.rangeClosed(1, number)
                .filter(it -> number % it == 0)
                .count();
    }
}
