public class Solution {
    public int[] twoSum(int[] ints, int target) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] + ints[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[0];
    }
}
