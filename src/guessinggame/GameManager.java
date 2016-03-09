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
public class GameManager {

    int rounds;
    PlayersRegistry registry;
    int[] allTimeSecretCounts;
    int[] allTimeGuessCounts;
    
    GameManager(int number_of_rounds) {
	rounds = number_of_rounds;
        registry = new PlayersRegistry();
	allTimeSecretCounts = new int[11];
	allTimeGuessCounts = new int[11];
    }
    
    /**
     * A single round of the game.
     */
    void round()
    {
        List<Player> players = registry.getAllPlayers();
        int[] secretCounts = new int[11];
        int[] guessCounts = new int[11];
        int[] numbers = new int[players.size()];
        
        // 1) Ask the secret numbers.
        for(int i = 0; i < players.size(); i++) {
            int n = players.get(i).chooseSecretNumber();
            if (n < 1)
                n = 1;
            if (n > 10)
                n = 10;
            numbers[i] = n;
            secretCounts[n]++;
	    allTimeSecretCounts[n]++;
        }
            
        // 2) Ask the guesses and assign the points.
        for(int i = 0; i < players.size(); i++) {
            int n = players.get(i).guessNumber();
	    if (n < 1)
		n = 1;
	    if (n > 10)
		n = 10;
	    int score = secretCounts[n] * n;
	    // the player is not rewarded for guessing is own secret number
	    if (numbers[i] == n)
		score -= n;
	    players.get(i).addPoints(score);
	    guessCounts[n]++;
	    allTimeGuessCounts[n]++;
        }
        
        // 3) Notify the players about the statistics of the round.
        for (Player player : players) {
            player.lastRoundStatistics(secretCounts, guessCounts);
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

	// 4) print some statistics
	System.out.println();
	System.out.println("N\tSECRET\tGUESS");
	for (int i = 1; i < allTimeSecretCounts.length; i++) {
	    System.out.println(i + "\t" + allTimeSecretCounts[i] + "\t" +
			       allTimeGuessCounts[i]);
	}
    }
        
    /**
     * Initialize and run the game.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int nrounds = 5;
	if (args.length > 0)
	    nrounds = Integer.parseInt(args[0]);
        GameManager game = new GameManager(nrounds);
        game.play();
    }
    
}
