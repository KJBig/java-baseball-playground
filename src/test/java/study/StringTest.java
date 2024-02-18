package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void splitTest() {
        //given
        String numberWithComma = "1,2";
        String numberWithoutComma = "1";

        //when
        String[] numberWithCommaSplit = numberWithComma.split(",");
        String[] numberWithoutCommaSplit = numberWithoutComma.split(",");

        //then
        assertThat(numberWithCommaSplit).contains("1", "2");
        assertThat(numberWithoutCommaSplit).contains("1");
    }

    @Test
    void replaceTest() {
        //given
        String strWithBracket = "(1,2)";

        //when
        String substring = strWithBracket.substring(1, 4);

        //then
        assertThat(substring).isEqualTo("1,2");
    }

    @DisplayName("문자열의 특정 위치의 값을 출력한다. 범위를 넘거갈 경우 예외가 발생한다.")
    @Test
    void charAtTest() {
        //given
        String abc = "abc";

        //when
        char c = abc.charAt(1);

        //then
        assertThat(c).isEqualTo('b');

        assertThatThrownBy(() -> {
            abc.charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("index out of range: 3");
    }
}
