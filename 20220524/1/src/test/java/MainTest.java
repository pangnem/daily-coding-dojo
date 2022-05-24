import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void testCase1() {
        Main main = new Main();

        assertThat(main.solution("g0en2T0s8eSoft")).isEqualTo("208");
    }
}
