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
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        int actual = solution.solution(a, b);

        assertThat(actual).isEqualTo(3);
    }

    @Test
    void testCase2() {
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};

        int actual = this.solution.solution(a, b);

        assertThat(actual).isEqualTo(-2);
    }
}
