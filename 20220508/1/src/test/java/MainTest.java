import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void testCase1() {
        Main main = new Main();

        assertThat(main.solution("found7, time: study; Yduts; emit, 7Dnuof")).isEqualTo("YES");
    }

    @Test
    void replaceAll() {
        String word = "ab;c,d'e";

        assertThat(word.replaceAll("[^[a-zA-Z]]", "")).isEqualTo("abcde");
    }

    @Test
    void subString() {
        String word = "12321";

        assertThat(word.substring(0, word.length() / 2)).isEqualTo("12");
        assertThat(word.substring(word.length() / 2 + 1)).isEqualTo("21");
    }

    @Test
    void objectsEquals() {
        assertThat(Objects.equals("123", "123")).isTrue();
        assertThat(Objects.equals("123", "321")).isFalse();
    }
}
