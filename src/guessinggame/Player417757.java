/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author cl417757
 */
public class Player417757 extends Player{
   private int numero=0;

    public Player417757() {
        super("previtali","417757");
    }

    

    

    @Override
    public int chooseSecretNumber() {
    if(numero==0){return 9;}
    if(numero==1){return 10;}
    if(numero==2){return 9;}
    if(numero==3){return 8;}
    else{return 10;
    }}

    @Override
    public int guessNumber() {
    if(numero==0){return 9;}
    if(numero==1){return 10;}
    if(numero==2){return 9;}
    if(numero==3){return 8;}
    else{return 10;}
    
    
    
    }
    
    public void LastRoundStatistic(int [] secrectCounts, int guessCount[] ){
        numero++;
    }
    
}
