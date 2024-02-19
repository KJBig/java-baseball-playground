package baseball.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Objects;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ComputerTest {
    
    @DisplayName("Computer 객체가 생성될 때 N자리 수의 랜덤 넘버를 생성한다.")
    @Test
    public void createRandomNumber() {
        //given
        int size = 3;

        //when
        Computer computer = new Computer(size);
        
        
        //then
        assertThat(computer.getNumbers().size()).isEqualTo(size);

    }

    @DisplayName("랜덤 넘버의 각 자리가 중복되지 않는다.")
    @Test
    public void checkDuplicateTest() {
        //given
        int size = 3;

        //when
        Computer computer = new Computer(size);


        //then
        assertThat(!Objects.equals(computer.getNumbers().get(0), computer.getNumbers().get(1))).isEqualTo(true);
        assertThat(!Objects.equals(computer.getNumbers().get(1), computer.getNumbers().get(2))).isEqualTo(true);
        assertThat(!Objects.equals(computer.getNumbers().get(2), computer.getNumbers().get(1))).isEqualTo(true);

    }

    @DisplayName("Computer의 랜덤 넘버는 1이상 10미만의 길이이다.")
    @Test
    public void randomNumberSizeTest() {
        //given
        int minSize = 0;
        int maxSize = 10;

        //then
        assertThatThrownBy(() ->{
            new Computer(minSize);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("1이상의 길이");

        assertThatThrownBy(() ->{
            new Computer(maxSize);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("10미만의 길이");

    }
}
