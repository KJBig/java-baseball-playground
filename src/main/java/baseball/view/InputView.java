package baseball.view;

import baseball.validator.InputValidator;
import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);
    public static void printGameStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static String inputUserNumbers(int size) {
        System.out.println("숫자를 입력해주세요 : ");
        String inputNumbers = scanner.nextLine();
        InputValidator.validateNumberFormat(inputNumbers);
        InputValidator.validateInputNumberSize(inputNumbers, size);
        InputValidator.validateNumberDuplicate(inputNumbers);
        return inputNumbers;
    }

    public static boolean isReStart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String restartInput = scanner.nextLine();
        InputValidator.validateNumberFormat(restartInput);
        InputValidator.validateInputNumberSize(restartInput, 1);
        return Integer.parseInt(restartInput) == 1;
    }
}
