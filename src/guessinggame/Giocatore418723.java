/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import static guessinggame.GameManager.rounds;

/**
 *
 * @author cl418723
 */
public class Giocatore418723 extends Player {
    
    public Giocatore418723() {
        super("bhutani", "418723");
    }

    public int chooseSecretNumber() {
        if (rounds < 2) {
            return 1;
        }else return 5;
    }

    public int guessNumber() {
        return 5;
    }
    
    
}
