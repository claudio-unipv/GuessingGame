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
    int c1,g1,cont1,cont2;
    
    Giocatore418377() {
        super("Rausa", "418377");
        randomGenerator = new Random();
        c1=10;
        g1=8;
        cont1=0;
        cont2=0;
    }
    
    @Override
    public int chooseSecretNumber() //numero segreto
    {   
        return c1;
    }
    
    @Override
    public int guessNumber() //predizione
    {
        return g1;
    }
    
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        
        int max=secretCounts[0]*1;
        c1=1;
        for(int i=1;i<secretCounts.length;i++){
            if(max<secretCounts[i]*i){
                max=secretCounts[i]*i;
                c1=i;
            }
        }
        
        int min=guessCounts[0]*1;
        g1=1;
        for(int i=1;i<guessCounts.length;i++){
            if(min<guessCounts[i]*i){
                min=guessCounts[i]*i;
                g1=i;
            }
        }
        
        
    }    
        

    
    
}
