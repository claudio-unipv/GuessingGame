/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author Andrea Cavagna
 */
public class Giocatore418635 extends Player {

    public Giocatore418635() {
        super("Cavagna", "418635");
    }
    
    

    public int chooseSecretNumber() {
        return 6;
    }

    public int guessNumber() {
      return 5;  }
    
    @Override
       public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
     
       }   
    
}
