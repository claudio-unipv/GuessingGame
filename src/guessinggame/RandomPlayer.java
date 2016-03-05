/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public int chooseNumber()
    {
        return randomGenerator.nextInt(10) + 1;
    }
    
    @Override
    public int guessNumber()
    {
        return randomGenerator.nextInt(10) + 1;
    }
}
