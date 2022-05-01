import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void testCase1() {
        Main main = new Main();

        assertThat(main.solution("it is time to study")).isEqualTo("study");
        assertThat(main.solution2("it is time to study")).isEqualTo("study");
    }
}
