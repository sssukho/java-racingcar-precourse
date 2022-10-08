package racingcar.model;

import java.util.Objects;
import racingcar.enumeration.CarStatus;

public class Car {
    public static final int FORWARD_START_INCLUSIVE = 4;
    public static final int INT = 9;
    public static final int FORWARD_END_INCLUSIVE = INT;
    private final Name name;
    private final ForwardCount forwardCount;
    private final ForwardString forwardString;

    public Car(Name name, ForwardCount forwardCount, ForwardString forwardString) {
        this.name = name;
        this.forwardCount = forwardCount;
        this.forwardString = forwardString;
    }

    public void setForwardResultByRandomNum(RandomNum randomNum) {
        if (randomNum.getNum() >= FORWARD_START_INCLUSIVE && randomNum.getNum() <= FORWARD_END_INCLUSIVE) {
            forwardCount.setCountByCarStatus(CarStatus.FORWARD);
            forwardString.setCountByCarStatus(CarStatus.FORWARD);
            return;
        }
        forwardCount.setCountByCarStatus(CarStatus.STOP);
        forwardString.setCountByCarStatus(CarStatus.STOP);
    }

    public Name getName() {
        return name;
    }

    public ForwardCount getForwardCount() {
        return forwardCount;
    }

    public ForwardString getForwardString() {
        return forwardString;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Car other = (Car) obj;
        return other.name.getCarName().equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, forwardCount, forwardString);
    }
}
