public class Solution {
    public int solution(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int divisorCount = getDivisorCount(i);

            if (divisorCount % 2 == 0) {
                result += i;
            }

            if (divisorCount % 2 != 0) {
                result -= i;
            }
        }

        return result;
    }

    private int getDivisorCount(int number) {
        int divisorCount = 0;
        for (int j = 1; j <= number / 2; j++) {
            if (number % j == 0) {
                divisorCount++;
            }
        }

        return ++divisorCount;
    }
}
