package racingcar.model;

public class Attempts {
    private static final String ERROR_INVALID_FORMAT = "시도 횟수는 양의 정수만 가능합니다";
    private int attempts;

    public Attempts(String input) {
        try {
            validateAttempts(input);
        } catch (IllegalArgumentException iae) {
            throw new IllegalArgumentException(ERROR_INVALID_FORMAT);
        }
    }

    private void validateAttempts(String input) throws IllegalArgumentException {
        attempts = Integer.parseInt(input);
        if (attempts <= 0) {
            throw new IllegalArgumentException(ERROR_INVALID_FORMAT);
        }
    }

    public int getAttempts() {
        return attempts;
    }
}
