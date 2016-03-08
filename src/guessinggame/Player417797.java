/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Random;

/**
 *
 * @author cl417797
 */
public class Player417797 extends Player {

    Random randomGenerator = new Random();
    int media, varianza, mediaGuess, varianzaGuess;

    public Player417797() {
        super("Bonandin", "417797");
    }

    @Override
    public int chooseSecretNumber() {
        if (this.mediaGuess == 0) {
            return (randomGenerator.nextInt(10) + 1);
        } else {
            int a = mediaGuess - (varianzaGuess / 2);
            int b = mediaGuess + (varianzaGuess / 2);
            if (a <= 1) {
                return randomGenerator.nextInt(1 + varianzaGuess / 2) + b;
            } else {
                return randomGenerator.nextInt(a);
            }
        }
    }

    @Override
    public int guessNumber() {
        if (this.media == 0) {
            return (randomGenerator.nextInt(10) + 1);
        } else {
            int a = media - (varianza / 2);
            int b = media + (varianza / 2);
            return randomGenerator.nextInt(1 + varianza / 4) + a;
        }
    }

    @Override
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        int somma = 0;
        int sommaVar = 0;
        for (int m : secretCounts) {
            somma += m;
        }
        media = somma / secretCounts.length;
        for (int i = 0; i < secretCounts.length; i++) {
            sommaVar += (secretCounts[i] - media) * (secretCounts[i] - media);
        }
        varianza = sommaVar / (secretCounts.length - 1);

        int sommaGuess = 0;
        int sommaVarGuess = 0;
        for (int m : secretCounts) {
            sommaGuess += m;
        }
        mediaGuess = sommaGuess / secretCounts.length;
        for (int i = 0; i < secretCounts.length; i++) {
            sommaVarGuess += (secretCounts[i] - mediaGuess) * (secretCounts[i] - mediaGuess);
        }
        varianzaGuess = sommaVarGuess / (secretCounts.length - 1);
    }
}
