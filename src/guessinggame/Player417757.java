/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author cl417757
 */
public class Player417757 extends Player{
   private int numero=0;

    public Player417757() {
        super("previtali","417757");
    }

    

    
@Override
    public int chooseSecretNumber() {
       return 2;
    
    
    }

    @Override
    public int guessNumber() {
        return 4;
    
    }
    
     public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        

        numero ++;            
            
    } 
    
}
