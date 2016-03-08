/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author Miky
 */
class Giocatore418574 extends Player {

    public Giocatore418574() {
    
        super("michelachinosi01", "418574");
    }

    @Override
    public int chooseSecretNumber() {
        return 8;
    }

    @Override
    public int guessNumber() {
        return 10;
    }   
}

