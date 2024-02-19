package baseball.validator;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputValidatorTest {
    @Test
    @DisplayName("숫자 이외의 값을 입력하면 예외가 발생한다.")
    public void inputNotNumberTest() {
        assertThatThrownBy(() -> {
            InputValidator.validateNumberFormat("1e3");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("숫자를 입력해주세요");
    }

    @Test
    @DisplayName("지정된 자릿수의 숫자를 입력하지 않을 시 예외가 발생한다.")
    public void inputSizeTest() {
        // given
        int size = 4;

        // when then
        assertThatThrownBy(() -> {
            InputValidator.validateInputNumberSize("123", size);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("숫자는 "+ size + "자리를 입력해주세요");
    }

    @Test
    @DisplayName("중복된 숫자를 입력 시 예외가 발생한다.")
    public void inputDuplicateNumberTest() {
        assertThatThrownBy(() -> {
            InputValidator.validateNumberDuplicate("122");
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("중복되지 않는 숫자를 입력해주세요");
    }
}
