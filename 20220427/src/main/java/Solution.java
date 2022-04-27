class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};

        int matchNumberCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
                continue;
            }

            for (int j = 0; j < lottos.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    matchNumberCount++;
                    System.out.println(lottos[i]);
                }
            }
        }

        if (zeroCount == 0 && matchNumberCount == 0) {
            return new int[]{6, 6};
        }

        answer[0] = 7 - zeroCount - matchNumberCount;
        answer[1] = 7 - matchNumberCount;

        if (answer[1] >= 7) {
            return new int[]{answer[0], 6};
        }

        return answer;
    }
}
