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
    
    private int number_to_guess;
    private int number_to_avoid;
    private int number_to_choose;
    private int points;
    private int round=1;

    public Player419842() {
        super("Luca", "419842");
    }

    @Override
    public int chooseSecretNumber() {
        if(number_to_choose==0){
            number_to_choose=1;
        }
        return number_to_choose;
    }

    @Override
    public int guessNumber() {
        if(number_to_guess==0){
            number_to_guess=6;
        }
        return number_to_guess;
    }
    
    @Override
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        
        int punteggio1 = 0;
        
        for (int i=1;i<secretCounts.length;i++){
            int pts = i*secretCounts[i];
            if(punteggio1<pts){
                punteggio1=pts;
                number_to_guess=i;
            }
        }
        
        for (int i=1;i<guessCounts.length;i++){
            int pts = i*guessCounts[i];
            if(punteggio1>pts || secretCounts[i]==0){
                number_to_choose = i;
                punteggio1=pts;
            }
        }
        round++;
    }
}
