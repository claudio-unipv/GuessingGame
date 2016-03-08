package guessinggame;

import java.util.Random;

/**
 * A player that make choices taking into account the statistics of
 * the last round.
 * 
 * @author Claudio Cusano
 */
public class AdaptivePlayer extends Player
{
    int guess;
    int secret;
    
    AdaptivePlayer() {
        super("adaptive", "00001");
	guess = 1;
	secret = 1;
    }
    
    @Override
    public int chooseSecretNumber()
    {
        return secret;
    }
    
    @Override
    public int guessNumber()
    {
        return guess;
    }

    @Override
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
	int reward = 0;
	for (int i = 1; i < secretCounts.length; i++) {
	    int r = i * secretCounts[i];
	    if (i == 1 || r > reward) {
		reward = r;
		guess = i;
	    }
	}

	for (int i = 1; i < guessCounts.length; i++) {
	    int r = i * guessCounts[i];
	    if (i == 1 || r < reward) {
		reward = r;
		secret = i;
	    }
	}
    }    
}
