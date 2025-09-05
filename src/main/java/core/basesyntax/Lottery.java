package core.basesyntax;

import java.util.Random;

public class Lottery {
    private int maxNumber = 100;

    public Ball getRandomBall() {
        Random random = new Random();
        ColorSupplier supplier = new ColorSupplier();

        Color ballColor = supplier.getRandomColor();
        int ballNumber = random.nextInt(maxNumber);

        return new Ball(ballColor, ballNumber);
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }
}
