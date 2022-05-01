import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void testCase1() {
        Main main = new Main();

        assertThat(main.solution(3, new String[]{"good", "Time", "Big"}))
                .isEqualTo("doog\nemiT\ngiB\n");
    }

    @Test
    void stringBuilderReverseTest() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("a");
        stringBuilder.append("\n");
        stringBuilder.append("b");
        stringBuilder.append("\n");
        stringBuilder.append("c");
        stringBuilder.reverse();

        assertThat(stringBuilder.toString()).isEqualTo("c\nb\na");
    }
}
