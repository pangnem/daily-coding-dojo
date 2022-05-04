import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void testCase1() {
        Main main = new Main();

        assertThat(main.solution("gooG")).isEqualTo("YES");
        assertThat(main.solution2("gooG")).isEqualTo("YES");
    }
}
