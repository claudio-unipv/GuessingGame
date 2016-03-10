/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

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
      return 4;
    }

    public int guessNumber() {
        return 4;
    }
    
    
}
