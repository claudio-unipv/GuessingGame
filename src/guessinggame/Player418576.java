/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author cl418576
 */
public class Player418576 extends Player{
    
    

    public Player418576() {
        super("pol1994", "418576");
    }

    @Override
    public int chooseSecretNumber() {
        return 1;
    }

    @Override
    public int guessNumber() {
        return 5;
    }
    
}
