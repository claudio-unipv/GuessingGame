/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.ArrayList;

/**
 *
 * @author cl410671
 */
public class Player410671 extends Player{
    private ArrayList<int[]> secretNumber;
    private ArrayList<int[]> guessNumber;
    private int round;
    public Player410671() {
        super("caronte", "410671");
        round = 0;
        secretNumber = new ArrayList<>();
        guessNumber = new ArrayList<>();
        
    }

    @Override
    public int chooseSecretNumber() {
        if(round==0)
            return 1;
        
        int tmp[] = new int[11];
        int max=100000;
        int secret = 1;
        
        for(int[] vet:guessNumber){
            for(int i=0;i<vet.length;i++){
                tmp[i] += vet[i];
            }
        }
        
        for(int i=0;i<tmp.length;i++){
            if(tmp[i]>max)
                max = tmp[i];
                secret = i;
        }
        
        return secret;
    }

    @Override
    public int guessNumber() {
        if(round==0)
            return 1;
        
        int tmp[] = new int[11];
        int guess = 10;
        int min = 0;
        
        for(int[] vet:secretNumber){
            for(int i=0;i<vet.length;i++){
                tmp[i] += vet[i];
            }
        }
        
        for(int i=0;i<tmp.length;i++){
            if(tmp[i]<min)
                min = tmp[i];
                guess = i;
        }
        
        return guess;
    }
    @Override
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        round++;
        secretNumber.add(secretCounts);
        guessNumber.add(guessCounts);
    }
    
}
