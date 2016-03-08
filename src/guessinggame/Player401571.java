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

    int guess=9;
    int round =1;
    private Random r;

    public Player401571() {
        super("Albertini", "401571");
        r = new Random();
    }

    @Override
    public int chooseSecretNumber() {
        return r.nextInt(3)+1;
    }
    
    
    @Override
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
    
    @Override
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        round++;
    }

}