package baseball;

import baseball.domain.GameProcessor;
import baseball.view.InputView;
import baseball.view.ResultView;

public class Application {
    public static void main(String[] args) {
        int numberSize = 3;
        while (true) {
            InputView.printGameStartMessage();
            GameProcessor gameProcessor = new GameProcessor();
            boolean isRestart = gameProcessor.startGameProcess(numberSize);
            ResultView.printGameEndMessage(numberSize);
            if (!isRestart) break;
        }
    }
}
