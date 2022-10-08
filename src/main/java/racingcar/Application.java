package racingcar;

import racingcar.enumeration.GameMode;
import racingcar.model.Container;

public class Application {
    public static void main(String[] args) {
        new Container(GameMode.CONSOLE).start();
    }
}
