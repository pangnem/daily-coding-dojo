import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        this.solution = new Solution();
    }

    @Test
    void testCase1() {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        int[] actual = this.solution.solution(lottos, win_nums);

        assertThat(actual).containsExactly(3, 5);
    }

    @Test
    void testCase2() {
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        int[] actual = this.solution.solution(lottos, win_nums);

        assertThat(actual).containsExactly(1, 6);
    }

    @Test
    void testCase3() {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};

        int[] actual = this.solution.solution(lottos, win_nums);

        assertThat(actual).containsExactly(1, 1);
    }
}
