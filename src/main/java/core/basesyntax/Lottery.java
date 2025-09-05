package core.basesyntax;

import java.util.Random;

public class Lottery {
    final int maxNumber = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();

        Color ballColor = supplier.getRandomColor();
        int ballNumber = random.nextInt(maxNumber);

        return new Ball(ballColor, ballNumber);
    }
}
