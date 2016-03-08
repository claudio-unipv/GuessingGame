package guessinggame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

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
        Comparator<Player> comp 
                          = new Comparator<Player>()  {

	    public int compare(Player p1, Player p2) {
                return p2.score() - p1.score();
            }
        };
        Collections.sort(players, comp);
    }
    
    /// Return a list of players.
    static ArrayList<Player> knownPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        
        players.add(new RandomPlayer());
        players.add(new Player401571());
        players.add( new Giocatore418635());
        players.add(new Giocatore419545());
        return players;
    }
}
