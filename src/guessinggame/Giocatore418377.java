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
    int c1,g1;
    
    Giocatore418377() {
        super("Rausa", "418377");
        c1=10;
        g1=10;
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
        
        //System.out.println(c1+" "+g1);
        
        int max=secretCounts[1]*1;
        //System.out.println(max);
        c1=1;
        for(int i=1;i<secretCounts.length;i++){
            //System.out.print(secretCounts[i]);
            if(max<secretCounts[i]*i){
                max=secretCounts[i]*i;
                c1=i;
                
            }
        }
        //System.out.print("\n"+max+ " "+c1+"\n");
        
        int min=guessCounts[1]*1;
        //System.out.println(min);
        g1=1;
        for(int i=1;i<guessCounts.length;i++){
            //System.out.print(guessCounts[i]);
            if(min>guessCounts[i]*i){
                min=guessCounts[i]*i;
                g1=i;
            }
        }
        //System.out.print("\n"+min+ " "+g1+"\n");
        
        
    }    
        

    
    
}
