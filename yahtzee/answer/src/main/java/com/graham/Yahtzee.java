package com.graham;

import static java.util.Arrays.stream;

public class Yahtzee {
    public static void main(String[] args) {
        final int numOfDice = 5;
        final Dice dice = new Dice(6);

        int count = 1;
        int[] roll = dice.roll(numOfDice);
        while (!yahtzee(roll)) {
            count++;
            roll = dice.roll(numOfDice);
        }

        System.out.println("Rolled a Yahtzee on roll " + count);
    }

    public static boolean yahtzee(final int[] rolledDice) {
        return stream(rolledDice).allMatch(i -> i == rolledDice[0]);
    }
}
