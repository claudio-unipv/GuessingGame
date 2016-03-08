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
    
    public Giocatore417039(){
        super("Calicchio","417039");
    }

    @Override
    public int chooseSecretNumber() {
    return 9;
    }

    @Override
    public int guessNumber() {
        return 9;
    }
    
}
