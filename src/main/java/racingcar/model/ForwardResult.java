package racingcar.model;

public class ForwardResult {
    public static final String FORWARD_CHARACTER = "-";

    private StringBuilder result;

    public ForwardResult() {
        result = new StringBuilder();
    }

    public void setResultByRandomNum(int randomNum) {
        if (randomNum >= 4 && randomNum <= 9) {
            result.append(FORWARD_CHARACTER);
        }
    }

    public String getResult() {
        return result.toString();
    }
}
