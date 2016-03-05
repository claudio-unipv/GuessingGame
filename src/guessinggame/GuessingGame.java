/*
 * A simple guessing game used as an example for the Software Engineering course
 * at the University of Pavia.
 */
package guessinggame;

import java.util.List;

/**
 * The manager of the guessing game.
 * 
 * @author Claudio Cusano
 */
public class GuessingGame {

    static int rounds = 5;
    PlayersRegistry registry;
    
    GuessingGame() {
        registry = new PlayersRegistry();
    }
    
    /**
     * A single round of the game.
     */
    void round()
    {
        List<Player> players = registry.getAllPlayers();
        int[] counts = new int[11];
        int[] numbers = new int[players.size()];
        
        for(int i = 0; i < players.size(); i++) {
            int n = players.get(i).chooseNumber();
            if (n < 1)
                n = 1;
            if (n > 10)
                n = 10;
            numbers[i] = n;
            counts[n]++;
        }
            
        for(int i = 0; i < players.size(); i++) {
            int n = players.get(i).guessNumber();
            int score = counts[n] * n;
            if (numbers[i] == n)
                score -= n;
            players.get(i).addPoints(score);
            players.get(i).lastRoundStatistics(counts);
        }
    }
    
    /**
     * Play the game and print the results.
     */
    public void play()
    {
        List<Player> players = registry.getAllPlayers();
        
        // 1) Play each round of the game
        for (int round = 0; round < rounds; round++)
            round();
        
        // 2) Sort the players by decreasing score
        registry.sortPlayers();
        
        // 3) print the final ranking
        for (int p = 0; p < players.size(); p++)
            System.out.println((p+1) + "\t" + players.get(p).name() + "\t" + players.get(p).score());
    }
        
    /**
     * Initialize and run the game.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.play();
    }
    
}
