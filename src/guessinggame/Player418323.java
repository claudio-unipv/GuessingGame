/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.Scanner;

/**
 *
 * @author cri
 */
public class Player418323 extends Player{
    
    Scanner input;
    
    public Player418323() {
        
        super("Santangelo", "418723");
       
    }

    @Override
    public int chooseSecretNumber() {
        
        System.out.println("\nInserisci il numero segreto: ");
         input = new Scanner(System.in);
        return input.nextInt();
        
    }

    @Override
    public int guessNumber() {
        System.out.println("\nInserisci il numero da indovinare: ");
        input = new Scanner(System.in);
        return input.nextInt() ;
        
    }
    
}
