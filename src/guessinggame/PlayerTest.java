/*
 * A simple guessing game used as an example for the Software Engineering course
 * at the University of Pavia.
 */
package guessinggame;

import java.util.HashMap;
import java.util.List;

/**
 * The manager of the guessing game.
 * 
 * @author Claudio Cusano
 */
public class PlayerTest {

    static int rounds = 5;
    PlayersRegistry registry;
    HashMap<String,Integer> gamer;
    PlayerTest() {
        gamer = new HashMap<>();
        registry = new PlayersRegistry();
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
        }
            
        // 2) Ask the guesses and assign the points.
        for(int i = 0; i < players.size(); i++) {
            int n = players.get(i).guessNumber();
            if (n >= 1 && n <= 10) {
                int score = secretCounts[n] * n;
                // the player is not rewarded for guessing is own secret number
                if (numbers[i] == n)
                    score -= n;
                players.get(i).addPoints(score);
                guessCounts[n]++;
            }            
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
            if(!gamer.containsKey(players.get(p).name())){
                gamer.put(players.get(p).name() ,players.get(p).score());
            }else{
                gamer.put(players.get(p).name() ,gamer.get(players.get(p).name())+players.get(p).score());
            }
    }


        
    /**
     * Initialize and run the game.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlayerTest game = new PlayerTest();
        for(int i=0;i<20;i++){
            game.play();
        }
        int max=0;
        for(String nome:game.gamer.keySet()){
            System.out.println(nome+"\t"+game.gamer.get(nome));
            if(game.gamer.get(nome)>max){
                max = game.gamer.get(nome);
            }
        }
        System.out.println(max);
    }
    
}
