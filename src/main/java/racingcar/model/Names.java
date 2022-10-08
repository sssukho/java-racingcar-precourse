package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Names {
    private final List<Name> carNames;

    public Names(String input) {
        carNames = new ArrayList<>();
        splitNamesAndSetCarNames(input);
    }

    private void splitNamesAndSetCarNames(String input) throws IllegalArgumentException {
        for (String separatedName : input.split(",")) {
            carNames.add(new Name(separatedName));
        }
    }

    public List<Name> getCarNames() {
        return carNames;
    }
}