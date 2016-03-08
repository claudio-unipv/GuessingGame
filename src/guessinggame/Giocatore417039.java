/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author cl417039
 */
public class Giocatore417039 extends Player{
    private int numero=0; 
    public Giocatore417039(){
        super("Calicchio","417039");
    }

    @Override
    public int chooseSecretNumber() {
    return 6;
    }

    @Override
    public int guessNumber() {
        
        return 2;
    }
    
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]){
        numero++;
    }
}
