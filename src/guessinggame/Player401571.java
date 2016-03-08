/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author User
 */
public class Player401571 extends Player{

    int scores_;
    
    public Player401571() {
        super("Albertini", "401571");
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

    @Override
    public int chooseSecretNumber() {
        return 5;
    }

    @Override
    public int guessNumber() {
        return 5;
    }
    
    
    
    
}