package guessinggame;

/**
 *
 * @author cl 411161
 */
public class Giocatore411161 extends Player {
    
    public Giocatore411161(){
        super("Varano", "411161");       
    }
    
    @Override
    public int chooseSecretNumber(){
    
    return 4;
    }
 
    
    @Override
    public int guessNumber()
    {
        return 7;
    }
}


    

