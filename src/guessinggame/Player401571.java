/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author User
 */
public class Player401571 extends Player{

    public Player401571() {
        super("Albertini", "401571");
    }

    @Override
    public int chooseSecretNumber() {
        return 5;
    }

    @Override
    public int guessNumber() {
        return 5;
    }
    
    
    
    
}