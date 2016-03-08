/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author Yoga
 */

public class Giocatore418334 extends Player {

private int numero = 0;


    public Giocatore418334() {
        super("Mohammad", "418334");
    }

    public int chooseSecretNumber() {
        
return 10;        
        
    }

    public int guessNumber() {
        
        
return 10;
        
        }
    
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        
        for(int i = 0; i<10 ; i++){
            System.out.println(secretCounts[i]);
        }
        System.out.println("Partita " + numero);
        numero ++;

            
            
    } 
    
    
    
    
    
}
