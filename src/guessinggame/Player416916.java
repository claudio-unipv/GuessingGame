/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;
import java.util.Random;

/**
 *
 * @author cl416916
 */
public class Player416916 extends Player{
    
    Random randomGen;
    
    Player416916(){
        super("Pozzoli Fabio", "416916");
        randomGen = new Random();
    }
    
/**
 * Return the secret number chosen by the player.
 * 
 * @return the chosen number.
 */
    public int chooseSecretNumber(){
        return 3;
    }

/**
 * Return the attempt of the player to guess the secret numbers
 * of the other players.
 * 
 * @return the guessed number.
 */
    public int guessNumber(){
        return randomGen.nextInt(10) + 1;
    }
    
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
      //       
    }   
    
}
