package racingcar.model;

import java.util.Objects;
import racingcar.enumeration.CarStatus;

public class Car {
    private final Name name;
    private final ForwardCount forwardCount;
    private final ForwardString forwardString;

    public Car(Name name, ForwardCount forwardCount, ForwardString forwardString) {
        this.name = name;
        this.forwardCount = forwardCount;
        this.forwardString = forwardString;
    }

    public void setForwardResultByRandomNum(int randomNum) {
        if (randomNum >= 4 && randomNum <= 9) {
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
