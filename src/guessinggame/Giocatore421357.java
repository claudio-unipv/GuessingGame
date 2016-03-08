/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author cl421357
 */
public class Giocatore421357 extends Player {
    
    Giocatore421357() {
        super("Riccardo Zichittella", "421357");
    }
    
    @Override
    public int chooseSecretNumber() {
        return 1;
    }

    @Override
    public int guessNumber() {
       return 6;
    }
    
    
    
    
        
    
}
