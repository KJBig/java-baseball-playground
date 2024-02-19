package baseball.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JudgeTest {

    @Test
    @DisplayName("정답 숫자와 같지만 자리수가 다를 때, 볼이 발생한다.")
    public void judgeBallTest() {
        // given
        Judge judge = new Judge();

        // when
        int ballCount = judge.judgeBall(3, Arrays.asList(1, 2, 3), "341");

        // then
        assertThat(ballCount).isEqualTo(2);
    }

    @Test
    @DisplayName("정답 숫자와 같고, 자리수도 같을 때, 스트라이크가 발생한다.")
    public void judgeStrikeTest() {
        // given
        Judge judge = new Judge();

        // when
        int strikeCount = judge.judgeStrike(3, Arrays.asList(1, 2, 3), "124");

        // then
        assertThat(strikeCount).isEqualTo(2);
    }

    @Test
    @DisplayName("스트라이크가 랜덤 넘버 숫자와 동일하면 게임이 종료된다.")
    public void judgeNothingTest() {
        // given
        Judge judge = new Judge();

        // when
        boolean isGameOver = judge.isGameOver(3, 3);

        // then
        assertThat(isGameOver).isEqualTo(true);
    }
}
