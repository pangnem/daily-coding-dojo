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
        int left = 13;
        int right = 17;

        int actual = solution.solution(left, right);

        assertThat(actual).isEqualTo(43);
    }

    @Test
    void testCase2() {
        int left = 24;
        int right = 27;

        int actual = solution.solution(left, right);

        assertThat(actual).isEqualTo(52);
    }
}
