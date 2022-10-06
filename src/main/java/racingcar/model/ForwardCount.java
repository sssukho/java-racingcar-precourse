package racingcar.model;

public class ForwardCount {

    private long forwardCount;

    public ForwardCount() {
        this.forwardCount = 0;
    }

    public void setForwardCountByRandomNum(int randomNum) {
        if (randomNum >= 4 && randomNum <= 9) {
            forwardCount += 1;
        }
    }

    public long getForwardCount() {
        return forwardCount;
    }
}
