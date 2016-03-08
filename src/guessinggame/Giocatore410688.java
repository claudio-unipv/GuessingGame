package guessinggame;

/**
 *
 * @author cl410688
 */
public class Giocatore410688 extends Player{

    Giocatore410688() {
        super("Perini", "410688");     
    }
    
    @Override
    public int chooseSecretNumber(){
        return 6;
    }
    
    @Override
    public int guessNumber(){
        return 8;
    }

}
