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
    
    public int to_guess;
    

    public Player419842() {
        super("Luca", "419842");
    }

    @Override
    public int chooseSecretNumber() {
        int[] arr = {2,1};
        int rnd = new Random().nextInt(arr.length);
        return arr[rnd];
    }

    @Override
    public int guessNumber() {
        if(to_guess==0){
            to_guess=10;
        }
        System.out.println(to_guess);
        return to_guess;
    }
    
    @Override
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        int max = 0;
        int number_to_guess=10;
        for (int i=0;i<secretCounts.length;i++){
            if (secretCounts[i]>max){
                max=secretCounts[i];
                number_to_guess = i;
            }
        }
        to_guess = number_to_guess;   
    }   
    
}
