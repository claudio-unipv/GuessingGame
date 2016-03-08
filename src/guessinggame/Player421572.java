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
       if (numero == 0) {
            return 9;
        }
        if (numero == 1) {
            return 10;
        }
        if (numero == 2) {
            return 9;
        }
        if (numero == 3) {
            return 8;
        }else {
            return 10;
        }
    
    
    }

    @Override
    public int guessNumber() {

if (numero == 0) {
            return 9;
        }
        if (numero == 1) {
            return 10;
        }
        if (numero == 2) {
            return 9;
        }
        if (numero == 3) {
            return 8;
        }else {
            return 10;
        }
    
    
    }
    
     public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        

        numero ++;            
            
    } 
    
    
    
}