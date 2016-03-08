/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author cl401370
 */
public class Player401370 extends Player{

    public Player401370() {
        super("Del Buono", "401370");
    }

    @Override
    public int chooseSecretNumber() {
        return 2;
    }

    @Override
    public int guessNumber() {
        return 10;
    }
    
}
