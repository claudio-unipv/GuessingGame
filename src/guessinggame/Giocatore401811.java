/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author federicovitro
 */
public class Giocatore401811 extends Player {

    private int count;
    private int r = 0;
    public Giocatore401811() {
        super("Vitrò", "401811");
        
    }

    @Override
    public int chooseSecretNumber() {
        switch (r){
            case 0:
                count = 3;
                break;
            case 1:
                count = 2;
                break;
            case 2:
                count = 5;
                break;
            case 3:
                count = 6;
                break;
            case 4:
                count = 4;
                break;
            default : count = 1;
        }
        return count;
    }

    @Override
    public int guessNumber() {
        switch (r){
            case 0:
                count = 9;
                break;
            case 1:
                count = 10;
                break;
            case 2:
                count = 9;
                break;
            case 3:
                count = 8;
                break;
            case 4:
                count = 10;
                break;
            default : count = 10;
        }
        return count;
    }
    
     public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        r++;                     
    } 
}