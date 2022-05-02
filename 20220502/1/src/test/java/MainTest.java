import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    @Test
    void testCase1() {
        Main main = new Main();

        assertThat(main.solution("a#b!GE*T@S")).isEqualTo("S#T!EG*b@a");
        assertThat(main.solution("kdj#@kdjg%$#kdjgk@kd$dk")).isEqualTo("kdd#@kkgj%$#dkgjd@kj$dk");
    }

    @Test
    void charAlphabet() {
        assertThat(Character.isAlphabetic('a')).isTrue();
        assertThat(Character.isAlphabetic('Z')).isTrue();

        assertThat(Character.isAlphabetic('!')).isFalse();
        assertThat(Character.isAlphabetic('$')).isFalse();
    }
}
