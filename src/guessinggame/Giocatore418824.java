/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Random;

/**
 *
 * @author cl418824
 */
public class Giocatore418824 extends Player{

    Random randomGenerator;
    int media;
    int varianza;
    int mediaguess;
    int varianzaguess;
    public Giocatore418824() {
        super("Amato", "418824");
        randomGenerator = new Random();
    }

    
    @Override
    public int chooseSecretNumber() {
        if(mediaguess == 0){
       return randomGenerator.nextInt(10) + 1;
        }
        else {
            int a = mediaguess - (varianzaguess/2);
            int b = mediaguess + (varianzaguess/2);
            if( a <= 1)
            return randomGenerator.nextInt(varianzaguess/2) + b;
            else return randomGenerator.nextInt(a);
        }
    }

    @Override
    public int guessNumber() {
         if(media == 0 || varianza == 0){
       return randomGenerator.nextInt(10) + 1;
        }
        else {
            int a = media - (varianza/2);
            int b = media + (varianza/2);
            return randomGenerator.nextInt(varianza/5)+ a;
            //return mediaguess;
        }
        
    }
    @Override
        public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
            int somma = 0;
            int num = 0;
            int esp;
            int sommaguess = 0;
            int numguess;
            for( int m : secretCounts) {
            somma += m;
        }
            media = somma/ secretCounts.length;
            for ( int i= 0 ; i < secretCounts.length ; i ++){
                num = secretCounts[i] - media;
            }
            esp = num * num;
            varianza = esp/ (secretCounts.length - 1);
            
             for( int m : guessCounts) {
            somma += m;
        }
            mediaguess = somma/ guessCounts.length;
            for ( int i= 0 ; i < guessCounts.length ; i ++){
                num = guessCounts[i] - media;
            }
            esp = num * num;
            varianzaguess = esp/ (guessCounts.length - 1);
    }  
        
}
