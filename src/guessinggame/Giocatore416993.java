/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Random;
/**
 *
 * @author cl416993
 */
public class Giocatore416993 extends Player {
Random randomGenerator;
int media;
int varianza;
int mediaGuess;
int varianzaGuess;
int numgiocatori=0;
    public Giocatore416993() {
        super("Alfeo", "416993");
        randomGenerator = new Random();
    }

    @Override
    public int chooseSecretNumber() {
                if (mediaGuess==0 || varianzaGuess==0) {
            return randomGenerator.nextInt(10) + 1;
        }
        else {
            int a=mediaGuess+(varianzaGuess/2);
            int b=mediaGuess-(varianzaGuess)/2;
            if (a==1) {
                return randomGenerator.nextInt(varianzaGuess/2)+b;
            }
            else {
                return randomGenerator.nextInt(a);
        }

        
    }
    }

    @Override
    public int guessNumber() {
        if (media==0 || varianza==0) {
            return randomGenerator.nextInt(10) + 1;
        }
        else {
            int a=media+(varianza/2);
            int b=media-(varianza)/2;
            return randomGenerator.nextInt(varianza+1)+a;
            
        }
            }
    @Override
        public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        int somma=0;
        int sommavar=0;
        for (int i=1; i<secretCounts.length ; i++) {
            somma+=i*secretCounts[i];
            numgiocatori+=secretCounts[i];
        }
        media=somma/numgiocatori;
        
         for (int i=1;i<secretCounts.length; i++) {
             sommavar+=(secretCounts[i]-media)*(secretCounts[i]-media);
         }
         varianza=sommavar/(numgiocatori-1);
         
        int sommaGuess=0;
        int sommavarGuess=0;
            for (int i=1; i<guessCounts.length ; i++) {
            sommaGuess+=i*guessCounts[i];
        }
        mediaGuess=sommaGuess/numgiocatori;
        
         for (int i=1;i<guessCounts.length; i++) {
             sommavarGuess+=(i*(guessCounts[i]-mediaGuess))*(i*(guessCounts[i]-mediaGuess));
         }
         varianzaGuess=sommavarGuess/(numgiocatori-1);
    }
       
        
        
}
