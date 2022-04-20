import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        this.solution = new Solution();
    }

    @Test
    void testCase1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] actual = solution.twoSum(nums, target);

        assertThat(actual).containsExactly(0, 1);
    }

    @Test
    void testCase2() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] actual = solution.twoSum(nums, target);

        assertThat(actual).containsExactly(1, 2);
    }

    @Test
    void testCase3() {
        int[] nums = {3, 3};
        int target = 6;

        int[] actual = solution.twoSum(nums, target);

        assertThat(actual).containsExactly(0, 1);
    }
}
