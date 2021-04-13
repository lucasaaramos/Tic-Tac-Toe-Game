/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author lucas
 */

    public class Circle {
    
        private int radius; //private mean they can not be accessed outside the class

    
    //creating a default circle using randon
    public Circle(){
    
        this.radius = pickRandomInt();
          
    }   
    
    //METHODS
    public Double getArea(){
        
        return ((this.radius * this.radius) * Math.PI); //returning the calc
    }
    
    public Double getPerimeter(){
        
        return 2 * Math.PI * this.radius;//returning the calc
        
    }
    
        private int pickRandomInt(){//setting randon and returning it to shape
        
        Random r = new Random();
        
        return (r.nextInt(100));
    }
 }

/*public class Circle {
    
    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }//reading the value and senfing back to the Shape class
    
    
     public static double getArea(String radius) {
        double r = Double.parseDouble(radius);//considering that the value can be double

        return ((r * r) * Math.PI); //returning the calc 
    
    }
    
    public static double getPerimeter(String radius) {
        double r = Double.parseDouble(radius);
        
        return 2 * Math.PI * r;//returning the calc 
    
    }*/

    

