package racingcar.model;

public class Name {
    private static final String ERROR_INVALID_LENGTH = "자동차 이름은 5자 이하여야 합니다.";
    private static final String ERROR_NULL = "자동차 이름은 null 이 될 수 없습니다.";

    String name;

    public Name(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String input) {
        if (isNullOrEmpty(input)) {
            throw new IllegalArgumentException(ERROR_NULL);
        }
        if (input.length() > 5) {
            throw new IllegalArgumentException(ERROR_INVALID_LENGTH);
        }
    }

    private boolean isNullOrEmpty(String input) {
        return input == null || input.length() == 0;
    }

    public String getName() {
        return name;
    }
}

