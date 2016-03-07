package guessinggame;

import java.util.Random;

/**
 * A player that randomly choose and guess numbers.
 * 
 * @author Claudio Cusano
 */
public class RandomPlayer extends Player
{
    Random randomGenerator;
    
    RandomPlayer() {
        super("random", "00000");
        randomGenerator = new Random();
    }
    
    @Override
    public int chooseSecretNumber()
    {
        return randomGenerator.nextInt(10) + 1;
    }
    
    @Override
    public int guessNumber()
    {
        return randomGenerator.nextInt(10) + 1;
    }
}
