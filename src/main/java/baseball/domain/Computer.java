package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private final List<Integer> numbers;

    public Computer(int size) {
        numbers = getRandomNumbers(size);
    }

    private List<Integer> getRandomNumbers(int size) {
        List<Integer> randomNumbers = new ArrayList<>();
        while (randomNumbers.size() < size) {
            int randomNumber = (int) (Math.random()*9)+1;
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber);
            }
        }
        return randomNumbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
