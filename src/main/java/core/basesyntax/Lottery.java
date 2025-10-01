package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public String getRandomBall() {
        int randomNubmer = new Random().nextInt(100);
        return getRandomColor() + " " + randomNubmer;
    }
}
