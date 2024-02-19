package baseball.domain;

import java.util.List;

public class Judge {
    public int judgeBall(int size, List<Integer> computerNumbers, String userNumbers) {
        int ballCount = 0;
        String[] numberSplit = userNumbers.split("");

        for (int i=0; i<numberSplit.length; i++) {
            int number = Integer.parseInt(numberSplit[i]);
            if (computerNumbers.contains(number)) {
                if (computerNumbers.get(i) != number) {
                    ballCount++;
                }
            }
        }
        return ballCount;
    }

    public int judgeStrike(int size, List<Integer> computerNumbers, String userNumbers) {
        int strikeCount = 0;
        String[] numberSplit = userNumbers.split("");
        for (int i=0; i<numberSplit.length; i++) {
            int number = Integer.parseInt(numberSplit[i]);
            if (computerNumbers.get(i) == number) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public boolean isGameOver(int strikeCount, int numberSize) {
        return strikeCount == numberSize;
    }
}
