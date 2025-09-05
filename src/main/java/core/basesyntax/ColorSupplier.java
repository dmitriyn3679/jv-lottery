package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Random random = new Random();

        int colorIdx = random.nextInt(Color.values().length);
        Color color = Color.values()[colorIdx];

        return color.toString();
    }
}
