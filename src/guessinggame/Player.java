package guessinggame;

/**
 * An abstract player of the guessing game.
 * 
 * @author Claudio Cusano
 */
abstract class Player
{
    String name_;
    String id_;
    int score_;
    
    /// Create a new player with the given name
    Player(String the_name, String the_id) {
        name_ = the_name;
        id_ = the_id;
        score_ = 0;        
    }
    
    /// Return the name of the player
    public String name() {
        return name_;
    }
    
    /// Return the identifier of the player.
    public String identifier() {
        return id_;
    }
    
    /// Return the current score of the player
    public int score()
    {
        return score_;
    }
    
    /// Increase the score by the given number of points
    public void addPoints(int points)
    {
        score_ += points;
    }
    
    /**
     * Return the secret number chosen by the player.
     * 
     * @return the chosen number.
     */
    public abstract int chooseSecretNumber();

    /**
     * Return the attempt of the player to guess the secret numbers
     * of the other players.
     * 
     * @return the guessed number.
     */
    public abstract int guessNumber();
    
    /**
     * Called after each round of the game to inform the player about
     * the number of times that each number has been chosen and guessed by the
     * players.
     * The player can use this information to adapt is strategy in choosing
     * and guessing number in the following rounds.
     * secretCounts[i] is the number of players that chose the number i in the last
     * round.
     * guessCounts[i] is the number of players that guessed the number i in the last
     * round.
     *  
     * @param secretCounts histogram of the secret numbers
     * @param guessCounts histogram of the guessed numbers
     */
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        // Do nothing by default.
    }    
}
