package guessinggame;

import java.util.Random;

/**
 * A player that randomly choose and guess numbers.
 *
 * @author Claudio Cusano
 */
public class Giocatore409448 extends Player {

    Random randomGenerator;
    int max = 9;

    Giocatore409448() {
        super("Accipicchiaaaaa", "409448");
        randomGenerator = new Random();
    }

    @Override
    public int chooseSecretNumber() {
        return randomGenerator.nextInt(5) + 1;
    }

    @Override
    public int guessNumber() {
        return (max);
        //return randomGenerator.nextInt(10) + 1;
    }

    @Override
    public void lastRoundStatistics(int[] secretCounts, int[] guessCounts) {
        max = 0;
        for (int i = 0; i < secretCounts.length-1; i++) {
            if (secretCounts[i+1]>secretCounts[i]) {
                max = secretCounts[i+1];
            }
        }
    }

}
