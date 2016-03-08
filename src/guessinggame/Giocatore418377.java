/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Random;

/**
 *
 * @author cl418377
 */
public class Giocatore418377 extends Player{
    
    Random randomGenerator;
    
    Giocatore418377() {
        super("pannolone pulla", "418377");
        randomGenerator = new Random();
    }
    
    @Override
    public int chooseSecretNumber() //numero segreto
    {
        return 4;
    }
    
    @Override
    public int guessNumber() //predizione
    {
        return randomGenerator.nextInt(5) + 3;
    }
        

    
    
}
