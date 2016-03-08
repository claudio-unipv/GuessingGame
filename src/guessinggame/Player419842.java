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
    public int number_to_avoid;

    public Player419842() {
        super("Luca", "419842");
    }

    @Override
    public int chooseSecretNumber() {
        int[] arr = {2,1};
        int rnd = new Random().nextInt(arr.length);
        do
        {
            rnd = new Random().nextInt(arr.length);
            System.out.println("evito..." +number_to_avoid);
            if (number_to_avoid==0){
                number_to_avoid=1;
            }
        }while(number_to_avoid==rnd);
        return rnd;
    }

    @Override
    public int guessNumber() {
        if(to_guess==0){
            to_guess=10;
        }
        System.out.println("indovino..."+to_guess);
        return to_guess;
    }
    
    @Override
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        int max1 = 0;
        int max2 = 0;
        int number_to_guess=10;
        for (int i=0;i<secretCounts.length;i++){
            if (secretCounts[i]>max1){
                max1=secretCounts[i];
                number_to_guess = i;
            }
        }
        
        to_guess = number_to_guess;
        
        for (int i=0;i<guessCounts.length;i++){
            if (guessCounts[i]>max2){
                max2=guessCounts[i];
                number_to_avoid = i;
            }
        }
    }   
    
}
