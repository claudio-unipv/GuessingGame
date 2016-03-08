/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author cl418646
 */
public class Giocatore418646 extends Player{
   
       
       
        public Giocatore418646() {
        super("Procop","418646");
        
    }

    @Override
    public int chooseSecretNumber() {
        return 8;
    }

    @Override
    public int guessNumber() {
        return 4;
    }
    
}
