/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Random;

/**
 *
 * @author guest-n55SzF
 */
public class Player421572 extends Player {
    Random randomGenerator;
    private int numero = 0;
    
    public Player421572() {
        super("Avarino", "421572");
        randomGenerator = new Random();
    }
    
    @Override
    public int chooseSecretNumber() {
        return 4;
    
    
    }

    @Override
    public int guessNumber() {
        return 1;
    
    }
    
     public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        

        numero ++;            
            
    } 
    
    
    
}