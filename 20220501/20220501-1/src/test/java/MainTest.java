import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void testCase1() {
        Main main = new Main();

        assertThat(main.solution("StuDY")).isEqualTo("sTUdy");
        assertThat(main.solution2("StuDY")).isEqualTo("sTUdy");
    }

    @Test
    void charTest() {
        assertThat(Character.isLowerCase('c')).isTrue();
        assertThat(Character.isLowerCase('C')).isFalse();
    }
}
