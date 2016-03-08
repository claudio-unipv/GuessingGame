/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import static java.lang.Math.round;

/**
 *
 * @author Alexandra Cucumetti
 */
public class Giocatore419545 extends Player {

    public Giocatore419545() {
        super("Alexandra", "419545");
    }
 private int round;
    public int chooseSecretNumber() {
     return 4;
    }

    public int guessNumber() {
          switch(round){
            case(1):
                return 9;
            case(2):
                return 10;
            case(3):
                return 9;
            case(4):
                return 8;
            default:
                return 10;
               
        }
       }
    
      public void lastRoundStatistics(int[] secretCounts, int guessCounts[]){
        round++;
    }
}
