/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author Riccardo
 */
public class Giocatore421357 extends Player {
    
     int roundc1;
     int roundc2;
    Giocatore421357() {
        super("Zichittella", "421357");
        roundc1=0;
        roundc2=0;
        
    }
    int num1=0;
    @Override
    public int chooseSecretNumber() {
        return 3;
            
        
    }
    int num2;
    @Override
    public int guessNumber() {
       if (roundc2==0){
           roundc2++;
           return 9;
           
       }
       else{                
       roundc2++;
       int finalind2=indmax1;
            if (roundc2%2!=0)
                return finalind2-1;
            else
                return finalind2+1;
       }
    }
    
    int indmax1;
    int indmax2;
    @Override
    public void lastRoundStatistics(int[] secretCounts, int guessCounts[]) {
        int []pesato1=new int[11];
        num1=0;
        indmax1=0;
        for(int i = 0; i<10 ; i++){
            pesato1[i]=(i+1)*secretCounts[i];
            //System.out.println("pesato "+(i+1)+"   :"+pesato[i]+"secret coutns :"+secretCounts[i]);
  
            if(i==0){
                num1=pesato1[i];
            }
            if(i>1){
                if(pesato1[i]>num1){
                    num1=pesato1[i];
                    indmax1=i+1;
                
                }
            }
            
        }
        
        int []pesato2=new int[11];
        num2=0;
        indmax2=0;
        //System.out.println(indmax);
        
        for(int i = 0; i<10 ; i++){
            pesato2[i]=(i+1)*secretCounts[i];
            System.out.println("pesato "+(i+1)+"   :"+pesato2[i]+"secret coutns :"+secretCounts[i]);
  
            if(i==0){
                num1=pesato2[i];
            }
            if(i>1){
                if(pesato2[i]<num1){
                    num1=pesato2[i];
                    indmax2=i+1;
                
                }
            }
            
        }
        
        
        

            
            
    } 
    
    
    
        
    
}
