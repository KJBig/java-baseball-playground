package baseball.domain;

import baseball.view.InputView;
import baseball.view.ResultView;
import java.util.List;

public class GameProcessor {
    public boolean startGameProcess(int numberSize) {
        Computer computer = new Computer(numberSize);

        while (true) {
            String userNumbers = InputView.inputUserNumbers(numberSize);
            boolean gameResult = judgeGameResult(numberSize, computer.getNumbers(), userNumbers);
            if (gameResult) break;
        }

        return InputView.isReStart();
    }

    private boolean judgeGameResult(int numberSize, List<Integer> computerNumbers, String userNumbers) {
        Judge judge = new Judge();
        int strikeCount = judge.judgeStrike(numberSize, computerNumbers, userNumbers);
        int ballCount = judge.judgeBall(numberSize, computerNumbers, userNumbers);
        ResultView.printJudgeResult(ballCount, strikeCount);
        return judge.isGameOver(strikeCount, numberSize);
    }
}
