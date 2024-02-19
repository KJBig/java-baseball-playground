package baseball.validator;

public class InputValidator {
    public static void validateInputNumberSize(String inputNumbers, int size) {
        if (inputNumbers.length() != size) {
            throw new IllegalArgumentException("숫자는 "+ size + "자리를 입력해주세요");
        }
    }

    public static void validateNumberFormat(String inputNumbers) {
        try {
            Integer.parseInt(inputNumbers);
        } catch (Exception e) {
            throw new IllegalArgumentException("숫자를 입력해주세요");
        }
    }

    public static void validateNumberDuplicate(String inputNumbers) {
        int[] existCount = new int[10];

        for (String inputNumber : inputNumbers.split("")) {
            int number = Integer.parseInt(inputNumber);
            if (existCount[number] != 0) {
                throw new IllegalArgumentException("중복되지 않는 숫자를 입력해주세요");
            }
            existCount[number]++;
        }
    }
}
