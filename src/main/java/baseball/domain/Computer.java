package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private final List<Integer> numbers;

    public Computer(int size) {
        numbers = getRandomNumbers(size);
    }

    private List<Integer> getRandomNumbers(int size) {
        checkSize(size);
        List<Integer> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < size) {
            int randomNumber = (int) (Math.random()*9)+1;
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return randomNumbers;
    }

    private void checkSize(int size) {
        if(size < 1) {
            throw new IllegalArgumentException("랜덤 넘버는 1이상의 길이입니다.");
        }

        if(size > 9) {
            throw new IllegalArgumentException("랜덤 넘버는 10미만의 길이입니다.");
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
