/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Random;

/**
 *
 * @author cl419842
 */
public class Player419842 extends Player{
    
    private int to_guess;
    

    public Player419842() {
        super("Luca", "419842");
    }

    @Override
    public int chooseSecretNumber() {
        int[] arr = {1,2,1,1,3,2,1,4,1};
        int rnd = new Random().nextInt(arr.length);
        return arr[rnd];
    }

    @Override
    public int guessNumber() {
        return to_guess;
    }
    
    @Override
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        int max = 0;
        int number_to_guess = 0;
        for (int i=0;i<secretCounts.length;i++){
            if (secretCounts[i]<max){
                max=secretCounts[i];
                number_to_guess = i;
            }
        }
        to_guess = number_to_guess;   
    }   
    
}
