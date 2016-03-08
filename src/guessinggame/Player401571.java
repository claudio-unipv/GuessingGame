/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Random;

/**
 *
 * @author User
 */
public class Player401571 extends Player{

    private Random r;
    
    public Player401571() {
        super("Albertini", "401571");
        r= new Random();
    }

    @Override
    public int chooseSecretNumber() {
        return r.nextInt(5)+1;
    }

    @Override
    public int guessNumber() {
        return 8;
    }
    
    
    
    
}