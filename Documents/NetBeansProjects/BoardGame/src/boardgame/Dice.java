/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

import java.util.Random;

/**
 * This will mimic action of a standard single Die
 * 
 * @author lucas
 */
public class Dice {
    
    private final int numSides;   //the number of sides on this dice
    
    public Dice(int sumSides){
        
        this.numSides = sumSides;
  
    }
    
    public int rollDice(){
        
        Random r = new Random();
        
        return (r.nextInt(numSides) + 1);

    }
    
}
