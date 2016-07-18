package com.graham;

import java.util.Random;
import java.util.stream.IntStream;

public class Dice {

    private final Integer sides;

    public Dice(final Integer numOfSides) {
        this.sides = numOfSides;
    }

    public int[] roll(final Integer numOfDice) {
        final Random r = new Random();
        return IntStream.range(0, numOfDice)
                .map(i -> r.nextInt(sides) + 1)
                .toArray();
    }
}
