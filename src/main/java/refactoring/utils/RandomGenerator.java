package refactoring.utils;

import java.util.Random;

public class RandomGenerator {

    private static final Random random = new Random();

    private RandomGenerator() {
    }

    public static boolean create() {
        return random.nextBoolean();
    }
}
