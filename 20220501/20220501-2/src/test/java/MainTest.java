import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void testCase1() {
        Main main = new Main();

        String actual = main.solution("it is time to study");

        assertThat(actual).isEqualTo("study");
    }
}
