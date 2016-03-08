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
    
    private int chosenGuess;
    private int chosenSecret;
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
        return chosenSecret;
    }

/**
 * Return the attempt of the player to guess the secret numbers
 * of the other players.
 * 
 * @return the guessed number.
 */
    public int guessNumber(){
        //return randomGen.nextInt(10) + 1;
        return chosenGuess;
    }
    
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
       
        //Sceglie come prossimo numero personale quello scelto di meno all fine dell'ultimo round
        int numero = 1;
        int min = 100;
        for(int i=0; i<guessCounts.length; i++){
            //System.out.println("conteggio" + guessCounts[i]);
            if (guessCounts[i] < min){
                min = guessCounts[i];
                numero = i+1;  }            
        }
        chosenSecret = numero;
        
        //System.out.println(numero);
        
        //Sceglie come prossimo numero da indovinare quello scelto di più dagli altri nell'ultimo round
        int max = 0;
        for(int i=0; i<secretCounts.length; i++){
            //System.out.println("conteggio" + secretCounts[i]);
            if (secretCounts[i] > max){
                max = secretCounts[i];
                numero = i+1;  }     
        }
        chosenGuess = numero;

        //System.out.println(numero);
        
    }   
    
}
