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
public class Player401555 extends Player {

    public Player401555() {
        super("Bugatti ", "401555");
    }

    @Override
    public int chooseSecretNumber() {
         return 10;
    }

    
    @Override
    public int guessNumber() {
       return 4;
    }
     
    

    
}
