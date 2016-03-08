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
    int numgiocatori = 0;
    public Giocatore418824() {
        super("Amato", "418824");
        randomGenerator = new Random();
    }

    
    @Override
    public int chooseSecretNumber() {
        if(mediaguess == 0 || varianzaguess == 0){
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
         if(media == 0){
       return randomGenerator.nextInt(10) + 1;
        }
         else if (varianza == 0)
             return media;
        else {
            int a = media - (varianza/2);
            int b = media + (varianza/2);
            return randomGenerator.nextInt(1 + varianza)+ a;
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
            for( int i = 0 ; i < secretCounts.length; i ++) {
            somma += i * secretCounts[i];
            numgiocatori += secretCounts[i];
        }
            media = somma/ numgiocatori;
            for ( int i= 0 ; i < secretCounts.length ; i ++){
                num = secretCounts[i] - media;
            }
            esp = num * num;
            varianza = esp/ (numgiocatori - 1);
            
             for( int i = 0 ; i < guessCounts.length; i ++) {
            sommaguess += i*secretCounts[i];
        }
            mediaguess = somma/ numgiocatori;
            for ( int i= 0 ; i < guessCounts.length ; i ++){
                num = guessCounts[i] - mediaguess;
            }
            esp = num * num;
            varianzaguess = esp/ (numgiocatori - 1);
    }  
        
}
