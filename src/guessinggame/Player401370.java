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

    int guess=9;
    int round =1;
    
    public Player401370() {
        super("Del Buono", "401370");
    }

    @Override
    public int chooseSecretNumber() {
        return 1;
    }

    @Override
    public int guessNumber() {
        
        switch(round){
            case(1):
                return 9;
            case(2):
                return 10;
            case(3):
                return 9;
            case(4):
                return 8;
            default:
                return 10;
               
        }
    }
    
    @Override
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
//        int max=0,j=0;
//        for(int i=1; i<secretCounts.length; i++){
//            if (secretCounts[i]*i>max) {
//                max = secretCounts[i] * i;
//                j=i;
//            }
//        }
//        guess = j;
        
        round++;
    }
}
