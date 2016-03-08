/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Random;
import java.io.*;

/**
 *
 * @author cl418319
 */
public class Player418319 extends Player {
    
    
   private Random rand;
   private int n;
    
    
    
  
    
    public  Player418319(){
        
        
        super("Bellati","418319");
        rand=new Random();
        rand.setSeed(System.currentTimeMillis());
        
    }
    
    @Override
    public int chooseSecretNumber(){
        
        return (int)rand.nextInt(10)+1;
     
    }

    @Override
    public int guessNumber() {
        
        return (int)rand.nextInt(10)+1;
    }
    
    
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        
        for(int i = 0; i<10 ; i++){
            System.out.println(secretCounts[i]);
        }
        System.out.println("Partita " + n);
        n++;
    
    
    
}
}
