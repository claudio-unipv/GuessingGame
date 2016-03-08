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
    private int guessed;

    public Player401571() {
        super("Albertini", "401571");
        r = new Random();
        guessed=1;
        //System.out.println(r.nextInt(5)+1);
    }

    @Override
    public int chooseSecretNumber() {
        return r.nextInt(5)+1;
        //return 10;
    }

    @Override
    public int guessNumber() {
        return getGuessed();
    }

    @Override
    public void lastRoundStatistics(int[] secretCounts, int[] guessCounts) {
        int product;
        int maxProduct=0;
        for (int i = 1; i < secretCounts.length; i++) {
            product=i*secretCounts[i];
            if(product>maxProduct){
                setGuessed(i);
            }
                
        }
        
    }

    public void setGuessed(int guessed) {
        this.guessed = guessed;
    }

    public int getGuessed() {
        return guessed;
    }

}