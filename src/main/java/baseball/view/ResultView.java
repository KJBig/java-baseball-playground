package baseball.view;

public class ResultView {
    public static void printJudgeResult(int ballCount, int strikeCount) {
        if (ballCount > 0) {
            System.out.print(ballCount + "볼 ");
        }

        if (strikeCount > 0) {
            System.out.print(strikeCount + "스트라이크");
        }

        if (ballCount == 0 && strikeCount == 0) {
            System.out.print("낫싱");
        }

        System.out.println();
    }

    public static void printGameEndMessage(int numberSize) {
        System.out.println(numberSize + "개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
