/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author Luca
 */
public class Giocatore392738 extends Player {

    private int i = 0;

    public Giocatore392738() {
        super("Zuffada", "392738");
    }

    @Override
    public int chooseSecretNumber() {

        return 6 - i;
    }

    @Override
    public int guessNumber() {
        int scelto = 0;
        if (i % 2 == 0) {
            scelto = 5 + i;
        } else {
            scelto = 5 - i;
        }

        i++;

        return scelto;
    }

}
