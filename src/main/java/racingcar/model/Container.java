package racingcar.model;

import racingcar.controller.Controller;
import racingcar.controller.console.ConsoleController;
import racingcar.enumeration.GameMode;
import racingcar.view.View;
import racingcar.view.console.ConsoleView;

public class Container {

    private Controller controller;
    private View view;

    public Container(GameMode mode) {
        initGameMode(mode);
    }

    public void initGameMode(GameMode mode) {
        if (mode.equals(GameMode.CONSOLE)) {
            initConsoleMode();
        }
    }

    private void initConsoleMode() {
        view = new ConsoleView();
        controller = new ConsoleController(view, new Round());

    }

    public void start() {
        controller.start();
    }
}
