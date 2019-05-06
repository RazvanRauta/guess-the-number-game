package udemy.springcourse;

import java.util.Random;

/**
 * The type Number generator.
 */
public class NumberGeneratorImpl implements NumberGenerator {

    //==fields==
    private final Random random = new Random();

    private int maxNumber = 100;

    // == public  methods ==
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}