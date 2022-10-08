package racingcar.model;

import racingcar.enumeration.CarStatus;

public class ForwardString {
    private static final String FORWARD_CHARACTER = "-";
    private static final int MAXIMUM_NAME_LENGTH = 5;

    private StringBuilder string;

    public ForwardString() {
        string = new StringBuilder();
    }

    public ForwardString(int carSize) {
        string = new StringBuilder(carSize + MAXIMUM_NAME_LENGTH);
    }

    public void setCountByCarStatus(CarStatus status) {
        if (status.equals(CarStatus.FORWARD)) {
            string.append(FORWARD_CHARACTER);
        }
    }

    public String getString() {
        return string.toString();
    }
}
