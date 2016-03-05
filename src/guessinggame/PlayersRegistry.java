/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Keep a list of known players.
 * 
 * @author Claudio Cusano
 */
class PlayersRegistry {
    ArrayList<Player> players;
    
    /// Build the registry by registering all the players.
    PlayersRegistry() {
        players = PlayersRegistry.knownPlayers();
    }
    
    /// Return a list of known players
    public List<Player> getAllPlayers() {
        return players;
    }
    
    /// Sort players by decreasing score.
    public void sortPlayers() {
        Collections.sort(players, (Player p1, Player p2) -> p2.score() - p1.score());
    }
    
    /// Return a list of players.
    static ArrayList<Player> knownPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        
        players.add(new RandomPlayer());
        
        // New players should be added here...
        
        return players;
    }
}
