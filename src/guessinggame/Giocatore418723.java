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
    
    private int numero = 0;

    public Giocatore418723() {
        super("bhutani", "418723");
    }

    public int chooseSecretNumber() {
      
        if (numero == 2) {
            return 10;
        }
        if (numero == 3) {
            return 9;
        }else {
            return 9;
        }
    


    }

    public int guessNumber() {
        return 10;
    }
    
    
}
