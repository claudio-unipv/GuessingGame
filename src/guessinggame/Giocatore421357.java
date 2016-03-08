/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author cl421357
 */
public class Giocatore421357 extends Player {
    
    Giocatore421357() {
        super("Riccardo Zichittella", "421357");
    }
    
    @Override
    public int chooseSecretNumber() {
        return 10;
    }

    @Override
    public int guessNumber() {
       return 10;
    }
    
    @Override
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        int medias=0;
        int mediag=0;
        System.out.println("LISTA CODICI SEGRETI");
        for(int i=0;i<secretCounts.length;i++){
            
            System.out.println(secretCounts[i]);
            medias+=secretCounts[i];
        }
        System.out.println("LISTA CODICI SEGRETI IPOTIZZATI DA ALTRI"); 
        for(int i=0;i<guessCounts.length;i++){
            System.out.println(guessCounts[i]);
            mediag+=guessCounts[i];
        }
        
        System.out.println("MEDIA CODICI SEGRETI"+medias/(secretCounts.length-1));
        System.out.println("LISTA CODICI SEGRETI IPOTIZZATI DA ALTRI"+mediag/(guessCounts.length-1));
            
        
    }  
    
    
        
    
}
